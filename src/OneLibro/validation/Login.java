package OneLibro.validation;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import OneLibro.data.AlmacenamientoUsuario;

public class Login{

    /*
     * Se guardan los datos de la cuenta, si la función extraerEmail es verdadera, o sea, existe una cuenta con ese email
     * De esta manera no se está leyengo el documento txt cada vez que se intente validar algo
     * Por ejemplo: Si intentaramos validar el estado, se debería recorrer el txt buscar el email y extraer el estado
     * Y así sucesivamente.
     */

    //Almacena los datos de la cuenta, si existe la cuenta.
    private String [] datos_usuario;

    //Recorre todo el fichero, y extrae los datos de la cuenta que coincida con el email dado. O sea, que exista el email.
    public boolean extraerEmail(String e_mail){
        AlmacenamientoUsuario usuario = new AlmacenamientoUsuario();
        boolean existe_usuario = false;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(usuario.getDIRECCION_FICHERO_USUARIO()));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                datos_usuario = linea.split("::");
                if(datos_usuario.length >= 11){

                    String email = datos_usuario[8];

                    if(email.equals(e_mail)){
                        existe_usuario = true;
                        break;
                    }else{
                        existe_usuario = false;
                    }
                }
            }
            lector.close();

        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo: " + e.getMessage());
        }
        return existe_usuario;
    }

    //Verifica que la contraseña coincida con la registrada en la cuenta con el email dado
    public boolean validarPsw (String e_mail, String psw){
        boolean existe_usuario = false;

        String email = datos_usuario[8];
        String contrasena = datos_usuario[9];

        if(email.equals(e_mail) && contrasena.equals(psw)){
            existe_usuario = true;
        }else{
            existe_usuario = false;
        }
        return existe_usuario;
    }

    //Valida que el estado de la cuenta sea Activo, para poder iniciar sesión
    public boolean validarEstado(){
        boolean existe_usuario = false;

        String estado = datos_usuario[10];

        if(estado.equals("Activo")){
            existe_usuario = true;
        }else{
            existe_usuario = false;
        }
        return existe_usuario;
    }

    //Obtiene el tipo de usuario que está intentando ingresar
    public String getTipoUsuario(){  
        return datos_usuario[0];
    }
}