package OneLibro.Facade;
import OneLibro.*;
import resources.Ansi;

public class RegistroClienteFacade {

    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private String telefono;
    private String pais;
    private String departamento;
    private String email;
    private String contrasena;

    //Setters
    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public void setDni(String dni) {this.dni = dni;}

    public void setEdad(int edad) {this.edad = edad;}

    public void setTelefono(String telefono) {this.telefono = telefono;}

    public void setEmail(String email) {this.email = email;}

    public void setPais(String pais) {this.pais = pais;}

    public void setDepartamento(String departamento) {this.departamento = departamento;}

    public void setContrasena(String contrasena) {this.contrasena = contrasena;}
    

    public void registrarCliente() {
         VerificacionClienteExistente verificacion = new VerificacionClienteExistente();
         Cliente cliente;
         AlmacenamientoCliente almacenamiento = new AlmacenamientoCliente();
         Beneficio beneficios = new Beneficio();

        if (verificacion.validarEmail(email) && verificacion.validarContrasena(contrasena)) {
            if(verificacion.verificarClienteExistente(dni, email )){
                System.out.println("\n\nUsuario Cliente ya registrado: DNI o E-mail ya registrados. Corrija e intente nuevamente");
            }else{
                // Generar beneficio basado en el país y departamento
                Beneficio beneficio = beneficios.generarBeneficio(pais, departamento);
                
                // Crear cliente con el beneficio asignado
                cliente = new Cliente(nombre, apellidos, dni, edad, telefono, email, contrasena, pais, departamento, beneficio);
                
                //almacena el cliente en un fichero
                almacenamiento.almacenarClientes(cliente);
                System.out.println(Ansi.GREEN + "\n\n¡Usuario registrado con exito!" + Ansi.RESET);
            }
        } else {
            System.out.println(Ansi.RED + "Error en los datos de registro:" + Ansi.RESET);
            System.out.println("E-mail o contraseña invalidas. Por favor, digite nuevamente.");
        }
    }
}