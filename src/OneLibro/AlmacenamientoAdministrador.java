package OneLibro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class AlmacenamientoAdministrador {

    private final String DIRECCION_FICHERO_ADMIN = "C:\\Users\\PEOPLE\\Desktop\\OneLibro\\src\\OneLibro\\Ficheros\\Administradores.txt";

    //Registrar clientees de las partidas jugadas
    public void almacenarAdministradores(Administrador admin){
        ArrayList<Administrador> administradores = new ArrayList<>();
        administradores.add(admin);

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(DIRECCION_FICHERO_ADMIN, true));
            for (Administrador mark : administradores){
                escritor.write(mark.toString());
                escritor.newLine();
            }
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo: " + e.getMessage());
        }

    }
    
    public String getDIRECCION_FICHERO_ADMIN() {
        return this.DIRECCION_FICHERO_ADMIN;
    }

}
