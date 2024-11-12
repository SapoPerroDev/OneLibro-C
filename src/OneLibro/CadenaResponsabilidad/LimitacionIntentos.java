package OneLibro.CadenaResponsabilidad;

import resources.Ansi;

public class LimitacionIntentos extends ControlVerificacion{
    private int peticiones_por_minuto;
    private int peticiones;
    private long hora_actual;

    public LimitacionIntentos(int peticiones_por_minuto) {
        this.peticiones_por_minuto = peticiones_por_minuto;
        this.hora_actual = System.currentTimeMillis();
    }

    public boolean verificar(String email, String password) {
        if (System.currentTimeMillis() > hora_actual + 60_000) {
            peticiones = 0;
            hora_actual = System.currentTimeMillis();
        }

        peticiones++;
        
        if (peticiones > peticiones_por_minuto) {
            System.out.println(Ansi.RED + "\n¡Se ha excedido el límite de intentos por minuto!" + Ansi.RESET);
            System.out.println("Intente nuevamente en 30 segundos");
            
            mostrarBarraDeProgreso(30);
            return false; // Retorna false después de esperar si se excedió el límite
        }
        return siguienteVerificacion(email, password);
    }

    private void mostrarBarraDeProgreso(int segundos) {
        int totalPasos = 30; // Cada paso representará un segundo
        int delay = (segundos * 1000) / totalPasos; // Tiempo de espera entre cada paso

        for (int i = 0; i <= totalPasos; i++) {
            int progreso = (i * 100) / totalPasos; // Calcula el porcentaje de progreso
            if (i == totalPasos) progreso = 100; // Asegura que llegue a 100% al final
            String barra = "\r[" + "█".repeat(i) + "-".repeat(totalPasos - i) + "] " + progreso + "%";
            System.out.print(barra); // Muestra la barra de progreso con el porcentaje
            try {
                Thread.sleep(delay); // Espera entre cada incremento de la barra
            } catch (InterruptedException e) {
                System.out.println("\nError: el hilo fue interrumpido durante la espera.");
                Thread.currentThread().interrupt(); // Restablece el estado de interrupción del hilo
                return;
            }
        }
        System.out.println("\n\nTiempo de espera completado. Puede reintentar.");
    }
}
