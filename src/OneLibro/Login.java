package OneLibro;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;

public class Login{

    public boolean verificarClienteExistente(String e_mail, String psw){
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

    /*public Usuario iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        int rol = 0;
        do{
            System.out.print("\n¿Desea iniciar sesión como cliente o registrador? (1: cliente / 2: administrador): ");
                rol = scanner.nextInt();

            if (rol == 2) {
                return new Administrador();
            } else if (rol == 1) {
                return new Cliente();
            } else {
                System.out.println("\nRol no válido.");
                return null;
            }
        }while(rol != 1 || rol != 2);
    }*/
}
