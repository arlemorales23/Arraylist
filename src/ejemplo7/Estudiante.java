package ejemplo7;

import java.util.ArrayList;

public class Estudiante {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();
        estudiantes.add("María");
        estudiantes.add("Alejandro");
        estudiantes.add("Ana");

        // Reemplazar elemento
        estudiantes.set(1, "Miguel");

        // Obtener tamaño
        int cantidad = estudiantes.size();

        // Imprimir resultado
        System.out.println("Lista de Estudiantes");
        estudiantes.forEach(e -> {
            System.out.println("- " + e);
        });

        System.out.println("Total: " + cantidad + " estudiantes");

    }
    }

