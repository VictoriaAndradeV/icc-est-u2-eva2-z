package controllers;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import models.Book;

public class LibroController {
    //la estructura debe permitir mantener el orden definido por los libros y evitar claves duplicadas según el criterio
    public Map<Book, Book> procesarLibros(List<Book> libros) {
        Map<Book, Book> mapa = new TreeMap<>();
        for (Book libro : libros) {
            mapa.put(libro, libro);
        }
        return mapa;
    }

}
