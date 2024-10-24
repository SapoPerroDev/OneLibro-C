package OneLibro;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Login{

    public boolean verificarLoginCliente(String e_mail, String psw){
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
    }
}
