package OneLibro;
import java.util.ArrayList;
import java.util.Scanner;
import OneLibro.FactoryMethod.*;

public class Administrador extends Usuario{

    public Administrador(String nombre, String apellidos, String dni, int edad, String telefono, String email, String contrasena, String pais, String departamento) {
        super(nombre, apellidos, dni, edad, telefono, email, contrasena, pais, departamento);
    }

    public void registrarLibros(ArrayList<Libro_Interface> librosDisponibles) {
        Libro_Creator factory = null;
        Scanner scanner = new Scanner(System.in);
        boolean seguirRegistrando = true;
        int tipo = 0;

        while (seguirRegistrando) {
            System.out.print("\nIngrese el tipo de libro a registrar (1: físico / 2: audiolibro / 3: electrónico/  4: salir): ");
                tipo = scanner.nextInt();

            if (tipo == 4) {
                seguirRegistrando = false;
                continue;
            }

            switch (tipo) {
                case 1:
                    factory = new ConcreteCreatorLibroFisico();
                    break;
                case 2:
                    factory = new ConcreteCreatorAudioLibro();
                    break;
                case 3:
                    factory = new ConcreteCreatorEbook();
                    break;
                default:
                    System.out.println("\n¡¡Tipo de libro no válido!!");
                    continue;
            }

            // Crear y agregar el libro a la lista
            Libro_Interface libro = factory.crearLibro();
            librosDisponibles.add(libro);
            System.out.println("\n¡¡Libro registrado exitosamente!!");
        }
    }
}
