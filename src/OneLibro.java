import java.util.ArrayList;
import java.util.Scanner;
import OneLibro.*;
import OneLibro.FactoryMethod.*;

public class OneLibro {

    private static ArrayList<Libro_Interface> librosDisponibles = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        //Bucle de selección de tipo de usuario
        while (continuar) {
            Usuario usuario = Login.iniciarSesion();

            if (usuario instanceof Administrador) {
                ((Administrador) usuario).registrarLibros(librosDisponibles);
            } else if (usuario instanceof Cliente) {
                ((Cliente) usuario).mostrarLibrosDisponibles(librosDisponibles);
            }

            //Preguntar si el usuario desea continuar
            System.out.print("\n\n¿Desea realizar otra operación? (si/no): ");
                String respuesta = scanner.nextLine();

            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }

        System.out.println("\n\nGracias por usar el sistema de gestión de pedidos de libros.");
    }
    
}

