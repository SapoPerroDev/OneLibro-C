package OneLibro.CadenaResponsabilidad;

import OneLibro.validation.Login;
import resources.Ansi;

public class VerificacionEstado extends ControlVerificacion {
    private Login login;

    public VerificacionEstado (Login login){
        this.login = login;
    }

    @Override
    public boolean verificar(String email, String password) {
        if(!login.validarEstado()){
            System.out.println(Ansi.RED + "\nLa cuenta se encuentra suspendida o bloqueada. Por favor, contactese con soporte." + Ansi.RESET);
            return false;
        }   
        return siguienteVerificacion(email, password);
    }
}
