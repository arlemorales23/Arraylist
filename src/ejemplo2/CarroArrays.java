package ejemplo2;

import java.util.ArrayList;

public class CarroArrays {
    public static void main(String[] args) {
        ArrayList<String> marcas = new ArrayList<>();

        marcas.add("Toyota");
        marcas.add("Mazda");
        marcas.add("Ford");
        marcas.add("Chevrolet");

        // Remover elemento
        marcas.removeIf(m -> m.startsWith("F"));

        // Obtener elemento en índice
        System.out.println(marcas.getFirst());

        // Iterar con forEach
        marcas.forEach(System.out::println);

    }
    }
