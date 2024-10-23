import java.util.Scanner;
import OneLibro.Administrador;
import OneLibro.Cliente;
import OneLibro.Login;
import OneLibro.Facade.RegistroClienteFacade;

public class OneLibro {

    private static Scanner input = new Scanner(System.in, "utf-8");

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
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
    
                System.out.println("\n\n***************************"
                                  + "\n:::::::::::Menú::::::::::::\n "
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
                    System.out.println("\n¡Inicio de sesión exitoso cliente!");
                    menuCliente();
                }else if(login.verificarAdministradorExistente(emaill, contrasenaa)){
                    System.out.println("\n¡Inicio de sesión exitoso admin!");
                    menuAdmin();
                }else{
                    System.out.println("\nNo se logro iniciar sesión. Corrija el E-mail o la contraseña e intente nuevamente");
                } 
                break;
            case 2:
                RegistroClienteFacade registro = new RegistroClienteFacade();

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

    public static void menuAdmin() {
        Administrador admin = new Administrador();

        int opcion = 0;
        do{
            System.out.println("\n\n**********************************"
                                  + "\n:::::::::::Menú - Admin:::::::::::\n"
                                  +"\n1. Registrar Libros"
                                  +"\n2. Mostrar Libros Registrados (pronto)"
                                  +"\n3: Editar Libros registrados (pronto)."
                                  +"\n4: Eliminar Libros registrados (pronto)."
                                  +"\n5: Salir."
                                  +"\n**********************************");
                
            System.out.print("\nSeleccione una opcion: ");
                   opcion = input.nextInt();
                   
                   
        switch (opcion) {
            case 1:
                admin.registrarLibros();
                break;

            case 2:
                System.out.println("\nEsta función estará disponible muy pronto :)");
                break;

            case 3:
                System.out.println("\nEsta función estará disponible muy pronto :)");
                break;
            case 4:
                System.out.println("\nEsta función estará disponible muy pronto :)");
                break;

            case 5:
                System.out.println("\nEstaremos esperandote nuevamente. Chao.");
                    menu();
                break;   

            default:
                System.out.println("\n\nOpcion Incorrecta. Inicie nuevamente el programa.\n");
                break;
            }
        }while(opcion != 5);          
    }

    public static void menuCliente() {
        Cliente cliente = new Cliente();

        int opcion = 0;
        do{
            System.out.println("\n\n************************************"
                                  + "\n:::::::::::Menú - Cliente:::::::::::\n"
                                  +"\n1. Mostrar catálogo completo de l6ibros."
                                  +"\n2. Buscar libro deseado (pronto)."
                                  +"\n3. Agregar al carrito (pronto)."
                                  +"\n4: Comprar (pronto)."
                                  +"\n5: Editar cuenta (pronto)."
                                  +"\n6: Salir."
                                  +"\n************************************");
                
            System.out.print("\nSeleccione una opcion: ");
                   opcion = input.nextInt();

                 
                            
        switch (opcion) {
            case 1:
                cliente.mostrarLibrosDisponibles();
                break;

            case 2:
                System.out.println("\nEsta función estará disponible muy pronto :)");
                break;

            case 3:
                System.out.println("\nEsta función estará disponible muy pronto :)");
                break;

            case 4:
                System.out.println("\nEsta función estará disponible muy pronto :)");
                break;
            case 5:
                System.out.println("\nEsta función estará disponible muy pronto :)");
                break;

            case 6:
                System.out.println("\nEstaremos esperandote nuevamente. Chao.");
                    menu();
                break;   

            default:
                System.out.println("\n\nOpcion Incorrecta. Inicie nuevamente el programa.\n");
                break;
            }
        }while(opcion != 5);          
    }
}
    

