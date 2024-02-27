package ejemplo4;

import java.util.ArrayList;
import java.util.Comparator;

public class Deportivo {
    public static void main(String[] args) {
        ArrayList<String> ropaDeportiva = new ArrayList<>();
        ropaDeportiva.add("Camisetas");
        ropaDeportiva.add("Pantalones");
        ropaDeportiva.add("Zapatillas");
        ropaDeportiva.add("Medias");

        // Ordenar
        //un Comparator te permite definir cómo se comparan dos objetos de una colección
        // para determinar su orden.
        ropaDeportiva.sort(Comparator.naturalOrder());

        // Imprimir
        System.out.print("Ropa ordenada: ");
        ropaDeportiva.forEach(i -> System.out.print(i + " "));
    }
}
