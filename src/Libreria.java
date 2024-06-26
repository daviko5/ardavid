import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Libreria {
    private ArrayList<Libro> libros;

    public Libreria() {
        libros = new ArrayList<>();
    }

    // Método para añadir un libro
    public void aniadirLibro(Libro libro) {
        libros.add(libro);
    }
    public void listaordenada(){
        Collections.sort(libros, Comparator.comparing(Libro::getCodigo));
        for (Libro l : libros){
            System.out.println(l);
        }

    }

    // Método para buscar un libro por título
    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null; // retorna null si no encuentra el libro
    }

    // Método para listar todos los libros
    public void listadeLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
