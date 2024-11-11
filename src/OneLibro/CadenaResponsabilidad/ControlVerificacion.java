package OneLibro.CadenaResponsabilidad;

public abstract class ControlVerificacion {
    private ControlVerificacion siguiente;

    // Construcción de cadena
    public static ControlVerificacion enlace(ControlVerificacion primero, ControlVerificacion... cadena) { // los tres puntos son como un arreglo de ese mismo tipo de dato
        ControlVerificacion head = primero;
        for (ControlVerificacion nextInChain: cadena) {
            head.siguiente = nextInChain;
            head = nextInChain;
        }
        return primero;
    }

    public abstract boolean verificar(String email, String password);

    protected boolean siguienteVerificacion(String email, String password) {
        if (siguiente == null) {
            return true;
        }
        return siguiente.verificar(email, password);
    }
} 