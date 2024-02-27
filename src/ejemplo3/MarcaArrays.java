package ejemplo3;

import java.util.ArrayList;

public class MarcaArrays {
    public static void main(String[] args) {
        ArrayList<String> marcas1 = new ArrayList<>();
        marcas1.add("Adidas");
        marcas1.add("Nike");

        ArrayList<String> marcas2 = new ArrayList<>();
        marcas2.add("Puma");
        marcas2.add("Adidas");

        // Comparar contenido
        System.out.println(marcas1.containsAll(marcas2)); // false

        // Clonar
        ArrayList<String> copiaMarcas = new ArrayList<>(marcas1);

        // Modificar copia
        copiaMarcas.add("Reebok");

        // Imprimir copia
        copiaMarcas.forEach(System.out::println);
    }
}
