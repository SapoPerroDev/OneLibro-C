package OneLibro.CadenaResponsabilidad;

import OneLibro.Login;
import resources.Ansi;

public class VerificacionEstado extends ControlVerificacion {
    @Override
    public boolean verificar(String email, String password) {
        Login login = new Login();
        if(!login.extraerEstado(email, password)){
            System.out.println(Ansi.RED + "\nLa cuenta se encuentra suspendida o bloqueada. Por favor, contactese con soporte." + Ansi.RESET);
            return false;
        }      
        return siguienteVerificacion(email, password);
    }
}
