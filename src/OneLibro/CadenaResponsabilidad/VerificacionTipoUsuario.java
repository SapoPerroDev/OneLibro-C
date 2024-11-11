package OneLibro.CadenaResponsabilidad;

import OneLibro.Login;

public class VerificacionTipoUsuario extends ControlVerificacion {
    private String tipoUsuario;

    @Override
    public boolean verificar(String email, String password) {
        Login login = new Login();
        if (login.extraerTipo(email, password)) {
            System.out.println("Admin");
                tipoUsuario = "Administrador";
            return true;
        }

        System.out.println("Cliente");
            tipoUsuario = "Cliente";
        return siguienteVerificacion(email, password);
        

    }
    
    public String getTipoUsuario() {
        return tipoUsuario;
    }
}
