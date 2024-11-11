package OneLibro.menus;

import java.util.Scanner;
import OneLibro.Cliente;

public class MenuCliente {

    private static Scanner input = new Scanner(System.in, "utf-8");

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
                    MenuPrincipal.menu();
                break;   

            default:
                System.out.println("\n\nOpcion Incorrecta. Inicie nuevamente el programa.\n");
                break;
            }
        }while(opcion != 5);          
    }
}
