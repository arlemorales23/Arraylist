package ejemplo1;

import java.util.ArrayList;

public class NombresArray {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Laura");
        nombres.add("Daniela");

        // Imprimir la lista
        System.out.println("Lista de Nombres:");
        for(String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
