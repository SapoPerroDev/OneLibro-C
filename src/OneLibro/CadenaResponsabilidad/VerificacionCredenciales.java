package OneLibro.CadenaResponsabilidad;

import OneLibro.Login;
import resources.Ansi;

public class VerificacionCredenciales extends ControlVerificacion{
    @Override
    public boolean verificar(String email, String password) {
        Login login = new Login();

        if (!login.extraerEmail(email)) {
            System.out.println(Ansi.RED + "\nEl Email ingresado no está registrado en OneLibro" + Ansi.RESET);
            return false;
        }

        if(!login.extraerPsw(email, password)){
            System.out.println(Ansi.RED + "\nContraseña Incorrecta. Digite nuevamente." + Ansi.RESET);
            return false;
        }      
        return siguienteVerificacion(email, password);
    }
}
