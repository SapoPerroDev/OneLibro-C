package OneLibro.FactoryMethod;

import java.util.Scanner;

public class LibroFisico implements Libro_Interface {
    
    //Atributos
    private String titulo;
    private String isbn;
    private String sinopsis;
    private String autor;
    private int precio;
    private int edicion;
    private int stock;
    private int paginas;
    private double peso;
    private String editorial;
    private String idioma;
    private String genero;
    private String encuadernado;
    private String fecha_publicacion;

    public LibroFisico() {
    }

    //Setters y Getters
    public String getTitulo() {return this.titulo;}
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() {return this.autor;}
    public void setAutor(String autor) { this.autor = autor; }

    public int getPrecio() {return this.precio;}
    public void setPrecio(int precio) {this.precio = precio;}

    public double getPeso() {return this.peso;}
    public void setPeso(double peso) { this.peso = peso; }

    public String getIsbn() {return this.isbn;}
    public void setIsbn(String isbn) {this.isbn = isbn;}

    public String getSinopsis() {return this.sinopsis;}
    public void setSinopsis(String sinopsis) {this.sinopsis = sinopsis;}

    public int getEdicion() {return this.edicion;}
    public void setEdicion(int edicion) {this.edicion = edicion;}  

    public String getEditorial() {return this.editorial;}
    public void setEditorial(String editorial) {this.editorial = editorial;}

    public int getPaginas() {return this.paginas;}
    public void setPaginas(int paginas) {this.paginas = paginas;}

    public String getIdioma() {return this.idioma;}
    public void setIdioma(String idioma) {this.idioma = idioma;}

    public String getGenero() {return this.genero;}
    public void setGenero(String genero) {this.genero = genero;}

    public String getEncuadernado() {return this.encuadernado;}
    public void setEncuadernado(String encuadernado) {this.encuadernado = encuadernado;}

    public String getFecha_publicacion() {return this.fecha_publicacion;}
    public void setFecha_publicacion(String fecha_publicacion) {this.fecha_publicacion = fecha_publicacion;}

    public int getStock() {return this.stock;}
    public void setStock(int stock) {this.stock = stock;}

    

    @Override
    public String mostrarDetalles() {
        return "\nLibro Físico: " + titulo
                                + "\nPrecio: "+ precio 
                                + "\nAutor: " + autor 
                                + "\nSinopsis: " + sinopsis
                                + "\nISBN: " + isbn
                                + "\nEncuadernado: " + encuadernado
                                + "\nEdicion: " + edicion
                                + "\nEditorial: " + editorial
                                + "\nPáginas: " + paginas
                                + "\nIdioma: " + idioma
                                + "\nGénero: " + genero
                                + "\nCantidad: " + stock
                                + "\nPeso: " + peso + "kg"
                                + "\nFecha de publicación: " + fecha_publicacion;
    }

    public void llenarDetalles() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nCrear libro físico: ");

        System.out.print("\nIngrese el título: ");
            this.titulo = scanner.nextLine();

        System.out.print("Ingrese el autor: ");
            this.autor = scanner.nextLine();
        
        System.out.print("Ingrese la sinopsis: ");
            this.sinopsis = scanner.nextLine();

        System.out.print("Ingrese el ISBN: ");
            this.isbn = scanner.nextLine();

        System.out.print("Ingrese el tipo de encuadernado: ");
            this.encuadernado = scanner.nextLine();

        System.out.print("Ingrese la edición: ");
            this.edicion = scanner.nextInt();
            scanner.nextLine();

        System.out.print("Ingrese la editorial: ");
            this.editorial = scanner.nextLine();

        System.out.print("Ingrese el número de páginas: ");
            this.paginas = scanner.nextInt();
            scanner.nextLine();

        System.out.print("Ingrese el idioma: ");
            this.idioma = scanner.nextLine();

        System.out.print("Ingrese el género: ");
            this.genero = scanner.nextLine();

        System.out.print("Ingrese la cantidad en stock: ");
            this.stock = scanner.nextInt();
            scanner.nextLine();

        System.out.print("Ingrese el peso del libro (kg): ");
            this.peso = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese la fecha de publicación del libro: ");
            this.fecha_publicacion = scanner.nextLine();

        System.out.print("Ingrese el precio: ");
            this.precio = scanner.nextInt();
    }
}
