package ejemplo6;

import java.util.ArrayList;

public class Tornillo {
    public static void main(String[] args) {
        ArrayList<String> tornillos = new ArrayList<>();
        tornillos.add("Cabeza ranurada");
        tornillos.add("Cabeza hexagonal");
        tornillos.add("Cabeza Phillips");
        tornillos.add("Cabeza plana");

        // Buscar elemento
        int indice = tornillos.indexOf("Cabeza Phillips");
        if (indice != -1) {
            System.out.println("Encontrado en índice: " + indice);
        } else {
            System.out.println("Elemento no encontrado");
        }

        // Obtener por índice
        String tipo = tornillos.get(2);
        System.out.println("Tipo: " + tipo);
    }
}
