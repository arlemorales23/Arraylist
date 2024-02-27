package ejemplo5;

import java.util.ArrayList;
import java.util.List;

public class Computador {
    public static void main(String[] args) {
        ArrayList<String> marcas = new ArrayList<>();
        marcas.add("Lenovo");
        marcas.add("HP");
        marcas.add("Acer");
        marcas.add("Lenovo");
        marcas.add("LG");

        // Filtrar con stream marcas que inician por L
        List<String> filtradas = marcas.stream()
                .filter(x -> x.startsWith("L")).toList();

        // Imprimir filtradas
        filtradas.forEach(System.out::println);
    }
}
