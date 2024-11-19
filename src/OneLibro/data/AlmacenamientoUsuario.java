package OneLibro.data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import OneLibro.models.Usuario;

public class AlmacenamientoUsuario {

    private final String DIRECCION_FICHERO_USUARIO = "C:\\Users\\PEOPLE\\Desktop\\OneLibro-C\\src\\OneLibro\\Ficheros\\Usuarios.txt";

    public void almacenarUsuarios(Usuario usuario){
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario);

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(DIRECCION_FICHERO_USUARIO, true));
            for (Usuario mark : usuarios){
                escritor.write(mark.toString());
                escritor.newLine();
            }
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo: " + e.getMessage());
        }

    }
    
    public String getDIRECCION_FICHERO_USUARIO() {
        return this.DIRECCION_FICHERO_USUARIO;
    }

}
