package OneLibro.FactoryMethod;

import java.util.Scanner;

public class AudioLibro implements Libro_Interface {

    //Atributos
    private String titulo;
    private String isbn;
    private String sinopsis;
    private String autor;
    private String duracion;
    private int precio;
    private int edicion;
    private String editorial;
    private String idioma;
    private String genero;
    private String fecha_publicacion;

    public AudioLibro() {
    }

    //Setters y Getters
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public String getTitulo() {return this.titulo;}
    
    public String getDuracion() {return this.duracion;}
    public void setDuracion(String duracion) {this.duracion = duracion;}

    public void setIsbn(String isbn) {this.isbn = isbn;}
    public String getIsbn() {return this.isbn;}

    public String getSinopsis() {return this.sinopsis;}
    public void setSinopsis(String sinopsis) {this.sinopsis = sinopsis;}

    public String getAutor() {return this.autor;}
    public void setAutor(String autor) {this.autor = autor;}

    public int getPrecio() {return this.precio;}
    public void setPrecio(int precio) {this.precio = precio;}

    public int getEdicion() {return this.edicion;}
    public void setEdicion(int edicion) {this.edicion = edicion;}

    public String getEditorial() {return this.editorial;}
    public void setEditorial(String editorial) {this.editorial = editorial;}

    public String getIdioma() {return this.idioma;}
    public void setIdioma(String idioma) {this.idioma = idioma;}

    public String getGenero() {return this.genero;}
    public void setGenero(String genero) {this.genero = genero;}

    public String getFecha_publicacion() {return this.fecha_publicacion;}
    public void setFecha_publicacion(String fecha_publicacion) {this.fecha_publicacion = fecha_publicacion;}

    @Override
    public String toString(){
        return getTitulo() + "::" + getPrecio() + "::" + getAutor() + "::" + getSinopsis() + "::" + getIsbn()
        + "::" + getDuracion() + "::" + getEdicion()+ "::" + getEditorial() + "::" + getIdioma()
         + "::" + getGenero() + "::" + getFecha_publicacion();
    }

    public String mostrarDetalles() {
        return "\nAudio Libro: " + titulo
                                + "\nPrecio: "+ precio 
                                + "\nAutor: " + autor 
                                + "\nSinopsis: " + sinopsis 
                                + "\nISBN: " + isbn
                                + "\nDuración: "+ duracion 
                                + "\nEdicion: " + edicion 
                                + "\nEditorial: " + editorial 
                                + "\nIdioma: " + idioma
                                + "\nGenero: " + genero
                                + "\nFecha de Publicaciòn: " + fecha_publicacion;
    }

    public void llenarDetalles() {
        Scanner scanner = new Scanner(System.in, "utf-8");

        System.out.println("\n\nCrear AudioLibro: ");

        System.out.print("\nIngrese el título: ");
            this.titulo = scanner.nextLine();

        System.out.print("Ingrese el autor: ");
            this.autor = scanner.nextLine();

        System.out.print("Ingrese la sinopsis: ");
            this.sinopsis = scanner.nextLine();

        System.out.print("Ingrese ISBN: ");
            this.isbn = scanner.nextLine();

        System.out.print("Ingrese la duración (minutos): ");
            this.duracion = scanner.nextLine();

        System.out.print("Ingrese la edición: ");
            this.edicion = scanner.nextInt();
            scanner.nextLine();

        System.out.print("Ingrese la editorial: ");
            this.editorial = scanner.nextLine();

        System.out.print("Ingrese el idioma: ");
            this.idioma = scanner.nextLine();

        System.out.print("Ingrese el genero: ");
            this.genero = scanner.nextLine();

        System.out.print("Ingrese la fecha de publicación: ");
            this.fecha_publicacion = scanner.nextLine();

        System.out.println("Ingrese el precio: ");
            this.precio = scanner.nextInt();
    }
}
