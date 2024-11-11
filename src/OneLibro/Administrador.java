package OneLibro;
import java.util.Scanner;
import OneLibro.FactoryMethod.*;
import resources.Ansi;

public class Administrador extends Usuario{

    public Administrador() {
    }

    public Administrador(String nombre, String apellidos, String dni, int edad, String telefono, String email, String contrasena, String pais, String departamento, String estado) {
        super("Administrador", nombre, apellidos, dni, edad, telefono, email, contrasena, pais, departamento, estado);
    }

    public void registrarLibros() {
        AlmacenamientoLibros almacenamiento = new AlmacenamientoLibros();
        Libro_Creator factory = null;
        Scanner scanner = new Scanner(System.in, "utf-8");
        boolean seguirRegistrando = true;
        int tipo = 0;

        while (seguirRegistrando) {
            System.out.println( "\n\n*************************************"
            + "\n:::::::Menú - Registro de Libros::::::::\n "
            + "\n1: Físico "
            + "\n2: Audiolibro"
            + "\n3: Electrónico"
            + "\n4: Salir"
            +"\n*************************************");
            System.out.print( "\nIngrese la opción deseada: ");
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
                    System.out.println(Ansi.RED + "\n\n¡¡Tipo de libro no válido!!" + Ansi.RESET);
                    continue;
            }

            // Crear y agregar el libro a la lista
            Libro_Interface libro = factory.crearLibro();
            almacenamiento.almacenarLibros(libro);
            System.out.println(Ansi.GREEN + "\n\n¡¡Libro registrado exitosamente!!" + Ansi.RESET);
        }
    }

    @Override
    public String toString() {
        return getTipo_usuario()+ "::" + getNombre() + "::" + getApellidos() + "::" + getDni()+ "::" + getEdad()+ "::" + getTelefono()+ "::" + getPais()+ "::" + getDepartamento()+ "::" + getEmail()+ "::" + getContrasena()+ "::" + getEstado();
    }
}
