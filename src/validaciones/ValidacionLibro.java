package validaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import models.Book;

public class ValidacionLibro {

    public static void validarResultadoTreeMap(Map<Book, Book> salida) {
        if (salida == null || salida.isEmpty()) {
            System.out.println("El mapa está vacío o es nulo");
            return;
        }

        List<Book> librosOrdenados = new ArrayList<>(salida.keySet());

        boolean hayErrores = false;

        for (int i = 0; i < librosOrdenados.size() - 1; i++) {
            Book actual = librosOrdenados.get(i);
            Book siguiente = librosOrdenados.get(i + 1);

            int cmpTitulo = actual.getTitulo().compareToIgnoreCase(siguiente.getTitulo());

            // Verificar orden descendente por título
            if (cmpTitulo < 0) {
                System.out.println("Error de orden: '" + actual.getTitulo()
                        + "' aparece antes que '" + siguiente.getTitulo()
                        + "' (debería ir después)");
                hayErrores = true;
            }

            // Verificar orden por año si títulos son iguales
            if (cmpTitulo == 0 && actual.getAnio() > siguiente.getAnio()) {
                System.out.println("Error de orden por año en títulos iguales: '"
                        + actual.getTitulo() + "' años " + actual.getAnio()
                        + " y " + siguiente.getAnio());
                hayErrores = true;
            }

            // Verificar duplicados
            if (cmpTitulo == 0 && actual.getAnio() == siguiente.getAnio()) {
                System.out.println("Duplicado encontrado: '" + actual.getTitulo()
                        + "' con año " + actual.getAnio());
                hayErrores = true;
            }
        }

        if (!hayErrores) {
            System.out.println("Validación completa");
        }
    }
}
