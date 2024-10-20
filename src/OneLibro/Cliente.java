package OneLibro;
import java.util.ArrayList;
import OneLibro.FactoryMethod.Libro_Interface;

public class Cliente extends Usuario{
    
    private Beneficio beneficio; // Relación con un objeto Beneficio más detallado

    public Cliente(String nombre, String apellidos, String dni, int edad, String telefono, String email, String contrasena, String pais, String departamento, Beneficio beneficio) {
        super(nombre, apellidos, dni, edad, telefono, email, contrasena, pais, departamento);
        this.beneficio = beneficio;
    }

    public Beneficio getBeneficio() {return this.beneficio;}

    public void mostrarLibrosDisponibles(ArrayList<Libro_Interface> librosDisponibles) {
        if (librosDisponibles.isEmpty()) {
            System.out.println("\nNo hay libros disponibles. Por favor, pida a un registrador que registre libros.");
            return;
        }else{
            System.out.println("\nLibros disponibles: ");
            for (int i = 0; i < librosDisponibles.size(); i++) {
                System.out.println("\n----------------------------" + (librosDisponibles.get(i).mostrarDetalles()));
            }
        }
    }

    @Override
    public String toString() {
        return getNombre() + "::" + getApellidos() + "::" + getDni()+ "::" + getEdad()+ "::" + getTelefono()+ "::" + getPais()+ "::" + getDepartamento()+ "::" + getEmail()+ "::" + getContrasena()+ "::" + getBeneficio();
    }
}
