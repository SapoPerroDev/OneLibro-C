import java.util.ArrayList;
import java.util.Scanner;
import OneLibro.*;
import OneLibro.FactoryMethod.*;

public class OneLibro {

    private static ArrayList<Libro_Interface> librosDisponibles = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);

        int opcion;
            
                System.out.println("***************************************************************" 
                                + "\n******************* Bienvid@ a OneLibro ***********************" 
                                + "\n***************************************************************");
                
                System.out.println("\nAquí encontrarás cualquier libro en los formatos más utilizados."
                        + "\nLa experiencia será maravillosa, espero disfrutes la navegación "
                        + "\n\n¡IMPORTANTE!:  "
                        + "\n1. Debes iniciar sesión para utilizar OneLibro."
                        + "\n2. Si no tienes una cuenta, deberás crearte una.");
    
                System.out.println("\n\n**************************"
                                  + "\n:::::::::::Menú:::::::::::\n "
                                  +"\n1. Iniciar Sesión."
                                  +"\n2. Registrar Cliente."
                                  +"\n3: Salir."
                                  +"\n***************************");
                
                System.out.print("\nSeleccione una opcion: ");
                   opcion = input.nextInt();
                   
                   
        switch (opcion) {
            case 1:
                
                break;
            case 2:
                break;
            case 3:
                System.out.println("\nEstaremos esperandote nuevamente. Chao.");
                    System.exit(0);
                break;         
            default:
                System.out.println("\n\nOpcion Incorrecta. Inicie nuevamente el programa.\n");
                break;
            }
        }

        /*Scanner scanner = new Scanner(System.in);
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

        System.out.println("\n\nGracias por usar el sistema de gestión de pedidos de libros.");*/
}
    

