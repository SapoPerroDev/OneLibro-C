package OneLibro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;

public class VerificacionAdministradorExistente {

    public boolean verificarAdministradorExistente(String d_n_i, String e_mail){
        AlmacenamientoAdministrador admin = new AlmacenamientoAdministrador();
        boolean existe_administrador = false;

        try {
            BufferedReader lector = new BufferedReader(new FileReader(admin.getDIRECCION_FICHERO_ADMIN()));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String [] bloques = linea.split("::");
                if(bloques.length == 16){

                    String email = bloques[7];
                    String dni = bloques[2];

                    if(dni.equals(d_n_i) || email.equals(e_mail)){
                        existe_administrador = true;
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

    public boolean validarEmail(String email) {
        // Lógica para validar email
        return email.contains("@");
    }

    public boolean validarContrasena(String contrasena) {
        // Lógica para validar la contraseña (longitud mínima, caracteres especiales, etc.)
        return contrasena.length() >= 8;
    }
    
}
