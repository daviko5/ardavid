import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libreria miLibreria = new Libreria();

       //eliminamos dos objetos para probar las ramas
        miLibreria.aniadirLibro(new Libro("cien años de soledad", "Gbriel garcia marquez", "2"));
        miLibreria.aniadirLibro(new Libro("padre rico padre pobre", "robert kiyosaki", "4"));
        // PARA PROBRAR  MERGE
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
