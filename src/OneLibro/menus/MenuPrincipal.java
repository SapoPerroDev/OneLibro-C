package OneLibro.menus;

import java.util.Scanner;

import OneLibro.CadenaResponsabilidad.ControlVerificacion;
import OneLibro.CadenaResponsabilidad.LimitacionIntentos;
import OneLibro.CadenaResponsabilidad.VerificacionCredenciales;
import OneLibro.CadenaResponsabilidad.VerificacionEstado;
import OneLibro.CadenaResponsabilidad.VerificacionTipoUsuario;
import OneLibro.Facade.RegistroClienteFacade;
import OneLibro.validation.Login;
import resources.Ansi;

public class MenuPrincipal {

    private static Scanner input = new Scanner(System.in, "utf-8");

    public static void menu() {
        int opcion = 0;
        do{
            System.out.println("\n................................................................"
                                + Ansi.GREEN + "\n..####...##..##..######..##......######..#####...#####....####.."
                                             + "\n.##..##..###.##..##......##........##....##..##..##..##..##..##."
                                             + "\n.##..##..##.###..####....##........##....#####...#####...##..##."
                                             + "\n.##..##..##..##..##......##........##....##..##..##..##..##..##."
                                             + "\n..####...##..##..######..######..######..#####...##..##...####.." + Ansi.RESET
                                             + "\n................................................................");

                
                System.out.println("\nAquí encontrarás cualquier libro en los formatos más utilizados."
                        + "\nLa experiencia será maravillosa, espero disfrutes la navegación "
                        + Ansi.RED + "\n\n¡IMPORTANTE!:  " + Ansi.RESET
                        + "\n1. Debes iniciar sesión para utilizar OneLibro."
                        + "\n2. Si no tienes una cuenta, deberás crearte una.");
    
                System.out.println("\n\n***************************"
                                  + "\n:::::::::::Menú:::::::::::: "
                                  +"\n1. Iniciar Sesión."
                                  +"\n2. Registrar Cliente."
                                  +"\n3: Salir."
                                  +"\n***************************");
                
                System.out.print("\nSeleccione una opcion: ");
                   opcion = input.nextInt();
                   
                   
        switch (opcion) {
            case 1:
                boolean success;

                Login login = new Login();

                ControlVerificacion cadena = ControlVerificacion.enlace(
                    new LimitacionIntentos(2),
                    new VerificacionCredenciales(login),
                    new VerificacionEstado(login),
                    new VerificacionTipoUsuario() 
                );


                do {
                    System.out.print("\nIngrese su email: ");
                        String email = input.next();

                    System.out.print("Ingrese su contraseña: ");
                        String password = input.next();

                    if (cadena.verificar(email, password)) {
                        System.out.println(Ansi.GREEN + "\n¡Inicio de sesión exitoso!" + Ansi.RESET);
                        success = true;     
                    } else {
                        success = false;
                    }
                } while (!success);

                //Terminada toda la cadena de forma correcta, obtiene el tipo de cuenta que está ingresando
                if (login.getTipoUsuario().equals("Administrador")) {
                    MenuAdmin.menuAdmin();
                } else{
                    MenuCliente.menuCliente();
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

                registro.registrarCliente(); // registra al usuario por medio del facade
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
}
