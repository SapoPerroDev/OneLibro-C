package OneLibro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import OneLibro.FactoryMethod.Libro_Interface;

public class AlmacenamientoLibros {

    private final String DIRECCION_FICHERO_LIBRO = "C:\\Users\\PEOPLE\\Desktop\\OneLibro\\src\\OneLibro-C\\Ficheros\\Libros.txt";

    //Registrar clientees de las partidas jugadas
    public void almacenarLibros(Libro_Interface librosDisponibles){
        ArrayList<Libro_Interface> libros = new ArrayList<>();
        libros.add(librosDisponibles);

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(DIRECCION_FICHERO_LIBRO, true));
            for (Libro_Interface mark : libros){
                escritor.write(mark.toString());
                escritor.newLine();
            }
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo: " + e.getMessage());
        }

    }
    
    public String getDIRECCION_FICHERO_LIBRO() {
        return this.DIRECCION_FICHERO_LIBRO;
    }

}
