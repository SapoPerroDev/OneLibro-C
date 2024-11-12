package OneLibro.CadenaResponsabilidad;

public class VerificacionTipoUsuario extends ControlVerificacion {
    @Override
    public boolean verificar(String email, String password) {
        if (obtenerDominio(email).equals("@onelibro.com")) {
            return true;
        }
        return siguienteVerificacion(email, password);
    }

    //Extrae el dominio del email ingresado
    public static String obtenerDominio(String email) {
        int index = email.indexOf("@");
        if (index != -1) {
            return email.substring(index);
        } else {
            return "Formato de correo no válido";
        }
    }
}
