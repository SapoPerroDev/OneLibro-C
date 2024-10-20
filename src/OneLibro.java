//import java.util.ArrayList;
import java.util.Scanner;
import OneLibro.Login;
//import OneLibro.*;
import OneLibro.Facade.RegistroFacade;
//import OneLibro.FactoryMethod.*;

public class OneLibro {

    //private static ArrayList<Libro_Interface> librosDisponibles = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);

        int opcion = 0;
        do{
            System.out.println("\n\n***************************************************************" 
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
                Login login = new Login();

                System.out.print("\nIngrese su email: ");
                    String emaill = input.next();

                System.out.print("Ingrese su contraseña: ");
                    String contrasenaa = input.next();

                if (login.verificarClienteExistente(emaill, contrasenaa)) {
                    System.out.println("\n¡Inicio de sesión exitoso!");
                }else{
                    System.out.println("\nNo se logro iniciar sesión. Corrija el E-mail o la contraseña e intente nuevamente");
                }

                break;
            case 2:
                RegistroFacade registro = new RegistroFacade();

                System.out.print("\nIngrese su nombre: ");
                    String nombre = input.next();
                    registro.setNombre(nombre);

                System.out.print("Ingrese su apellido: ");
                    String apellido = input.next();
                    registro.setApellidos(apellido);

                System.out.print("Ingrese su DNI: ");
                    String dni = input.next();
                    registro.setDni(dni);

                System.out.print("Ingrese su edad: ");
                    int edad = input.nextInt();
                    registro.setEdad(edad);

                System.out.print("Ingrese su telefono: ");
                    String telefono = input.next();
                    registro.setTelefono(telefono);

                System.out.print("Ingrese su país: ");
                    String pais = input.next();
                    registro.setPais(pais);

                System.out.print("Ingrese su departamento: ");
                    String departamento = input.next();
                    registro.setDepartamento(departamento);
                
                System.out.print("Ingrese su email: ");
                    String email = input.next();
                    registro.setEmail(email);

                System.out.print("Ingrese su contraseña: ");
                    String contrasena = input.next();
                    registro.setContrasena(contrasena);


                registro.registrarCliente();
                break;
            case 3:
                System.out.println("\nEstaremos esperandote nuevamente. Chao.");
                    System.exit(0);
                break;         
            default:
                System.out.println("\n\nOpcion Incorrecta. Inicie nuevamente el programa.\n");
                break;
            }
        }while(opcion != 3);          
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
    

