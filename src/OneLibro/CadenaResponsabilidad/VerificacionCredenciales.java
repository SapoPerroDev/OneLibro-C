package OneLibro.CadenaResponsabilidad;

import OneLibro.validation.Login;
import resources.Ansi;

public class VerificacionCredenciales extends ControlVerificacion{
    private Login login;
    public VerificacionCredenciales (Login login){
        this.login = login;
    }

    @Override
    public boolean verificar(String email, String password) {

        if (!login.extraerEmail(email)) {
            System.out.println(Ansi.RED + "\nEl Email ingresado no está registrado en OneLibro" + Ansi.RESET);
            return false;
        }

        if(!login.validarPsw(email, password)){
            System.out.println(Ansi.RED + "\nContraseña Incorrecta. Digite nuevamente." + Ansi.RESET);
            return false;
        }      
        return siguienteVerificacion(email, password);
    }
}
