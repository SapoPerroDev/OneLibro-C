package OneLibro.menus;

import java.util.Scanner;
import OneLibro.Administrador;


public class MenuAdmin {

    private static Scanner input = new Scanner(System.in, "utf-8");

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
                    MenuPrincipal.menu();
                break;   

            default:
                System.out.println("\n\nOpcion Incorrecta. Inicie nuevamente el programa.\n");
                break;
            }
        }while(opcion != 5);          
    }
}
