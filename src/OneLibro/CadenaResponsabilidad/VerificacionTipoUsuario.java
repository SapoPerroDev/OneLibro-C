package OneLibro.CadenaResponsabilidad;

public class VerificacionTipoUsuario extends ControlVerificacion {
    private String tipo_usuario;

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
    
    public String getTipoUsuario() {
        return tipo_usuario;
    }
}
