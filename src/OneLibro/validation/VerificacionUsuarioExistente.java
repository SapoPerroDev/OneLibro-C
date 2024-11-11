package OneLibro.validation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import OneLibro.data.AlmacenamientoUsuario;

public class VerificacionUsuarioExistente {

    public boolean verificarUsuarioExistente(String d_n_i, String e_mail){
        AlmacenamientoUsuario usuario = new AlmacenamientoUsuario();
        boolean existente_usuario = false;

        try {
            BufferedReader lector = new BufferedReader(new FileReader(usuario.getDIRECCION_FICHERO_USUARIO()));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String [] bloques = linea.split("::");
                if(bloques.length >= 11){

                    String email = bloques[8];
                    String dni = bloques[3];

                    if(dni.equals(d_n_i) || email.equals(e_mail)){
                        existente_usuario = true;
                    }else{
                        existente_usuario = false;
                    }
                }
            }
            lector.close();

        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo: " + e.getMessage());
        }
        return existente_usuario;
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
