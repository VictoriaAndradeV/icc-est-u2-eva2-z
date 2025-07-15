package models;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return anio == other.anio &&
                titulo.equalsIgnoreCase(other.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo.toLowerCase(), anio);
    }

    @Override
    public int compareTo(Book otro) {
        int cmpTitulo = otro.titulo.compareToIgnoreCase(this.titulo); // orden descendente por título
        if (cmpTitulo != 0)
            return cmpTitulo;

        return Integer.compare(this.anio, otro.anio); // orden ascendente por año
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " - " + anio;
    }

}
