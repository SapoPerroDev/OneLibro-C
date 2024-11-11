package OneLibro.models;

public class Usuario {
    
    private String tipo_usuario;
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private String telefono;
    private String pais;
    private String departamento;
    private String email;
    private String contrasena;
    private String estado;

    public Usuario() {
    }
    
    public Usuario(String tipo_usuario, String nombre, String apellidos, String dni, int edad, String telefono, String pais, String departamento, String email, String contrasena, String estado) {
        this.tipo_usuario = tipo_usuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.telefono = telefono;
        this.pais = pais;
        this.departamento = departamento;
        this.email = email;
        this.contrasena = contrasena;
        this.estado = estado;
    }


    public String getTipo_usuario() {return this.tipo_usuario;}
    public void setTipo_usuario(String tipo_usuario) {this.tipo_usuario = tipo_usuario;}

    public String getEstado() {return this.estado;}
    public void setEstado(String estado) {this.estado = estado;}

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
