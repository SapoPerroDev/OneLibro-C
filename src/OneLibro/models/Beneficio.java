package OneLibro.models;

public class Beneficio {

    private String nombre;
    private String tipo;        // Tipo de beneficio (descuento, envío gratuito, etc.)
    private double descuento;   // Valor del descuento
    private String condiciones; // Condiciones para aplicar el beneficio
    private String fechaInicio;
    private String fechaFin;
    private double montoMaximo;

    public Beneficio(String nombre, String tipo, double descuento, String condiciones, String fechaInicio, String fechaFin, double montoMaximo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descuento = descuento;
        this.condiciones = condiciones;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoMaximo = montoMaximo;
    }
    
    public Beneficio(){}

    // Getters y setters para los atributos
    public String getNombre() {return this.nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getTipo() {return this.tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public double getDescuento() {return this.descuento;}
    public void setDescuento(double descuento) {this.descuento = descuento;}

    public String getCondiciones() {return this.condiciones;}
    public void setCondiciones(String condiciones) {this.condiciones = condiciones;}

    public String getFechaInicio() {return this.fechaInicio;}
    public void setFechaInicio(String fechaInicio) {this.fechaInicio = fechaInicio;}

    public String getFechaFin() {return this.fechaFin;}
    public void setFechaFin(String fechaFin) {this.fechaFin = fechaFin;}

    public double getMontoMaximo() {return this.montoMaximo;}
    public void setMontoMaximo(double montoMaximo) {this.montoMaximo = montoMaximo;}


    public Beneficio generarBeneficio(String pais, String departamento) {
        if (pais.equalsIgnoreCase("Chile") && departamento.equalsIgnoreCase("Santiago")) {
            return new Beneficio("Descuento de bienvenida", "Descuento", 10.0, "Solo para primeras compras", "2024-01-01", "2024-12-31", 10000);
        } else if (pais.equalsIgnoreCase("Colombia") && departamento.equalsIgnoreCase("Antioquia")) {
            return new Beneficio("Envio gratuito", "Envio gratuito", 0.0, "Solo valido en productos seleccionados", "2024-01-01", "2024-12-31", 0);
        } else {
            return new Beneficio("Sin beneficio", "Ninguno", 0.0, "No se aplica ningun beneficio", "null", "null", 0);
        }
    }

    @Override
    public String toString() {
        return getNombre() + "::" + getTipo() + "::" + getDescuento()+ "::" + getCondiciones()+ "::" + getFechaInicio()+ "::" + getFechaFin()+ "::" + getMontoMaximo();
    }
}
