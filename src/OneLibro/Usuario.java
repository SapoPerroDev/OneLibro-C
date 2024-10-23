package OneLibro;

public class Usuario {
    
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private String telefono;
    private String pais;
    private String departamento;
    private String email;
    private String contrasena;



    public Usuario() {
    }
    

    public Usuario(String nombre, String apellidos, String dni, int edad, String telefono, String email, String contrasena, String pais, String departamento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.contrasena = contrasena;
        this.pais = pais;
        this.departamento = departamento;
    }



    public String getContrasena() {return this.contrasena;}
    public void setContrasena(String contrasena) {this.contrasena = contrasena;}

    public String getPais() {return this.pais;}
    public void setPais(String pais) {this.pais = pais;}

    public String getDepartamento() {return this.departamento;}
    public void setDepartamento(String departamento) {this.departamento = departamento;}

    public String getNombre() {return this.nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellidos() {return this.apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public String getDni() {return this.dni;}
    public void setDni(String dni) {this.dni = dni;}

    public int getEdad() {return this.edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public String getTelefono() {return this.telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}

    public String getEmail() {return this.email;}
    public void setEmail(String email) {this.email = email;}
}
