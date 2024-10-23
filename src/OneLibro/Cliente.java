package OneLibro;
import java.util.ArrayList;
import OneLibro.FactoryMethod.Libro_Interface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cliente extends Usuario{
    
    private Beneficio beneficio; // Relación con un objeto Beneficio más detallado


    public Cliente() {
    }


    public Cliente(String nombre, String apellidos, String dni, int edad, String telefono, String email, String contrasena, String pais, String departamento, Beneficio beneficio) {
        super(nombre, apellidos, dni, edad, telefono, email, contrasena, pais, departamento);
        this.beneficio = beneficio;
    }

    public Beneficio getBeneficio() {return this.beneficio;}

     //Mostrar Libros Registrados
     public void mostrarLibrosDisponibles(){

        AlmacenamientoLibros libros = new AlmacenamientoLibros();
        ArrayList<String> librosDisponibles = new ArrayList<>();

        try {
            BufferedReader lector = new BufferedReader(new FileReader(libros.getDIRECCION_FICHERO_LIBRO()));
            String linea = "";

            while ((linea = lector.readLine()) != null) {
               String [] bloques = linea.split("::");

                if(bloques.length == 11){

                    String titulo = bloques[0];
                    String precio = bloques[1];
                    String autor = bloques[2];
                    String sinopsis = bloques[3];
                    String isbn = bloques[4];
                    String duracion = bloques[5];
                    int edicion = Integer.parseInt(bloques[6]);
                    String editorial = bloques[7];
                    String idioma = bloques[8];
                    String genero = bloques[9];
                    String fecha_publicacion = (bloques[10]);

                    String audio_libro = "\nAudio Libro: " + titulo
                                + "\nPrecio: "+ precio 
                                + "\nAutor: " + autor 
                                + "\nSinopsis: " + sinopsis 
                                + "\nISBN: " + isbn
                                + "\nDuración: "+ duracion 
                                + "\nEdicion: " + edicion 
                                + "\nEditorial: " + editorial 
                                + "\nIdioma: " + idioma
                                + "\nGenero: " + genero
                                + "\nFecha de Publicaciòn: " + fecha_publicacion;

                    librosDisponibles.add(audio_libro);
                }
                if(bloques.length == 12){

                    String titulo = bloques[0];
                    String precio = bloques[1];
                    String autor = bloques[2];
                    String sinopsis = bloques[3];
                    String isbn = bloques[4];
                    String formato = bloques[5];
                    int paginas = Integer.parseInt(bloques[6]);
                    int edicion = Integer.parseInt(bloques[7]);
                    String editorial = bloques[8];
                    String idioma = bloques[9];
                    String genero = bloques[10];
                    String fecha_publicacion = (bloques[11]);

                    String eBook = "\nAudio Libro: " + titulo
                                + "\nPrecio: "+ precio 
                                + "\nAutor: " + autor 
                                + "\nSinopsis: " + sinopsis 
                                + "\nISBN: " + isbn
                                + "\nFomato: "+ formato
                                + "\nPáginas: "+ paginas
                                + "\nEdicion: " + edicion 
                                + "\nEditorial: " + editorial 
                                + "\nIdioma: " + idioma
                                + "\nGenero: " + genero
                                + "\nFecha de Publicaciòn: " + fecha_publicacion;

                    librosDisponibles.add(eBook);
                }
                if(bloques.length == 14){
            
                    String titulo = bloques[0];
                    String precio = bloques[1];
                    String autor = bloques[2];
                    String sinopsis = bloques[3];
                    String isbn = bloques[4];
                    String encuadernado = bloques[5];
                    int edicion = Integer.parseInt(bloques[6]);
                    String editorial = bloques[7];
                    int paginas = Integer.parseInt(bloques[8]);
                    String idioma = bloques[9];
                    String genero = bloques[10];
                    int stock = Integer.parseInt(bloques[11]);
                    int peso = Integer.parseInt(bloques[12]);
                    String fecha_publicacion = (bloques[13]);

                    String libro_fisico = "\nLibro Físico: " + titulo
                                + "\nPrecio: "+ precio 
                                + "\nAutor: " + autor 
                                + "\nSinopsis: " + sinopsis
                                + "\nISBN: " + isbn
                                + "\nEncuadernado: " + encuadernado
                                + "\nEdicion: " + edicion
                                + "\nEditorial: " + editorial
                                + "\nPáginas: " + paginas
                                + "\nIdioma: " + idioma
                                + "\nGénero: " + genero
                                + "\nCantidad: " + stock
                                + "\nPeso: " + peso + "kg"
                                + "\nFecha de publicación: " + fecha_publicacion;

                    librosDisponibles.add(libro_fisico);
                }
            }
            lector.close();

        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo: " + e.getMessage());
        }

        System.out.println("\n\n\n*****************************************************"
                         + "\n                   Libros disponibles" 
                         + "\n*****************************************************");

        if(librosDisponibles.size() < 1){
            System.out.println("\n¡No hay libros disponibles por el momento! Por favor, ingresa más tarde.\n");
        }else{
            System.out.println("\nLibros puestos para la compra: ");
   
            System.out.println("\n:::::::::::::::::::::::::::::::::::");
            for (int i=0;i<librosDisponibles.size();i++) {
                System.out.println(librosDisponibles.get(i));
                System.out.println("\n:::::::::::::::::::::::::::::::::::");
              }
        }
    }
    @Override
    public String toString() {
        return getNombre() + "::" + getApellidos() + "::" + getDni()+ "::" + getEdad()+ "::" + getTelefono()+ "::" + getPais()+ "::" + getDepartamento()+ "::" + getEmail()+ "::" + getContrasena()+ "::" + getBeneficio();
    }
}
