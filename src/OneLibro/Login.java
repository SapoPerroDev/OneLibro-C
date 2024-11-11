package OneLibro;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Login{

 /*private String [] datos_usuario;

    public void extraerDatosCadenaResponsabilidad(){
        AlmacenamientoUsuario usuario = new AlmacenamientoUsuario();
        try {
            BufferedReader lector = new BufferedReader(new FileReader(usuario.getDIRECCION_FICHERO_USUARIO()));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                datos_usuario = linea.split("::");
            }
            lector.close();

        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo: " + e.getMessage());
        }
    }

    public String[] getDatos_usuario() {
        return this.datos_usuario;
    }

    public boolean extraerEmail(String e_mail){

            if(getDatos_usuario().length >= 9){
                String email = bloques[7];

            if(email.equals(e_mail)){
                existe_usuario = true;
                break;
            }else{
                 existe_usuario = false;
            }
        }
    }*/

    public boolean extraerEmail(String e_mail){
        AlmacenamientoUsuario usuario = new AlmacenamientoUsuario();
        boolean existe_usuario = false;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(usuario.getDIRECCION_FICHERO_USUARIO()));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String [] bloques = linea.split("::");
                if(bloques.length >= 11){

                    String email = bloques[8];

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

    public boolean extraerPsw(String e_mail, String psw){
        AlmacenamientoUsuario usuario = new AlmacenamientoUsuario();
        boolean existe_usuario = false;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(usuario.getDIRECCION_FICHERO_USUARIO()));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String [] bloques = linea.split("::");
                if(bloques.length >= 11){

                    String email = bloques[8];
                    String contrasena = bloques[9];

                    if(email.equals(e_mail) && contrasena.equals(psw)){
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

    public boolean extraerEstado(String e_mail, String psw){
        AlmacenamientoUsuario usuario = new AlmacenamientoUsuario();
        boolean existe_usuario = false;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(usuario.getDIRECCION_FICHERO_USUARIO()));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String [] bloques = linea.split("::");
                if(bloques.length >= 11){

                    String email = bloques[8];
                    String contrasena = bloques[9];
                    String estado = bloques[10];

                    if(email.equals(e_mail) && contrasena.equals(psw) && estado.equals("Activo")){
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

    // --------------------------------------------------

    public boolean extraerTipo(String e_mail, String psw){
        AlmacenamientoUsuario usuario = new AlmacenamientoUsuario();
        boolean existe_usuario = false;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(usuario.getDIRECCION_FICHERO_USUARIO()));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String [] bloques = linea.split("::");
                if(bloques.length >= 11){

                    String tipo_usuario = bloques[0];
                    String email = bloques[8];
                    String contrasena = bloques[9];
                    

                    if(email.equals(e_mail) && contrasena.equals(psw) && tipo_usuario.equals("Administrador")){
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

    /*public boolean verificarLoginCliente(String e_mail, String psw){
        AlmacenamientoCliente cliente = new AlmacenamientoCliente();
        boolean existe_cliente = false;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(cliente.getDIRECCION_FICHERO_CLIENTE()));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String [] bloques = linea.split("::");
                if(bloques.length == 16){

                    String email = bloques[7];
                    String contrasena = bloques[8];

                    if(email.equals(e_mail) && contrasena.equals(psw)){
                        existe_cliente = true;
                        break;
                    }else{
                        existe_cliente = false;
                    }
                }
            }
            lector.close();

        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo: " + e.getMessage());
        }
        return existe_cliente;
    }

    public boolean verificarLoginAdministrador(String e_mail, String psw){
        AlmacenamientoAdministrador administrador = new AlmacenamientoAdministrador();
        boolean existe_administrador = false;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(administrador.getDIRECCION_FICHERO_ADMIN()));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String [] bloques = linea.split("::");
                if(bloques.length == 9){

                    String email = bloques[7];
                    String contrasena = bloques[8];

                    if(email.equals(e_mail) && contrasena.equals(psw)){
                        existe_administrador = true;
                        break;
                    }else{
                        existe_administrador = false;
                    }
                }
            }
            lector.close();

        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo: " + e.getMessage());
        }
        return existe_administrador;
    }*/
}