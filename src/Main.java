import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libreria miLibreria = new Libreria();

        miLibreria.aniadirLibro(new Libro("odisea", "Homero","777"));
        miLibreria.aniadirLibro(new Libro("Don Quijote", "Miguel de Cervantes", "0101"));
        miLibreria.aniadirLibro(new Libro("cien años de soledad", "Gbriel garcia marquez", "2"));


        System.out.println("Lista de los libros:");
        miLibreria.listadeLibros();
        System.out.println("lista ordenada");
        miLibreria.listaordenada();

        System.out.println("\nBuscando libro 'odisea':");
        Libro libroBuscado = miLibreria.buscarLibro("odisea");
        if (libroBuscado != null) {
            System.out.println(libroBuscado);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}
