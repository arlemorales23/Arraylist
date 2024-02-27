package ejemplo8;

import java.util.Scanner;

public class MainProducto {
    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("Menú Principal");
            System.out.println("1. Agregar producto");
            System.out.println("2. Obtener producto");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");

            System.out.print("Opción: ");
            option = scanner.nextInt();

            switch(option) {
                case 1:
                    // Agregar producto
                    System.out.print("Id: ");
                    int id = scanner.nextInt();
                    System.out.print("Nombre: ");
                    String name = scanner.next();
                    System.out.print("Precio: ");
                    double price = scanner.nextDouble();

                    Product product = new Product(id, name, price);
                    dao.save(product);
                    System.out.println("Producto agregado");
                    break;

                case 2:
                    // Obtener producto
                    System.out.print("Id del producto: ");
                    id = scanner.nextInt();

                    Product p = dao.get(id);
                    System.out.println(p.getName() + " - " + p.getPrice());
                    break;

                case 3:
                    // Actualizar producto
                    System.out.print("Id del producto a actualizar: ");
                    id = scanner.nextInt();

                    Product currentProduct = dao.get(id);

                    System.out.println("Nombre actual: " + currentProduct.getName());
                    System.out.print("Nuevo nombre: ");
                    String newName = scanner.next();

                    System.out.println("Precio actual: " + currentProduct.getPrice());
                    System.out.print("Nuevo precio: ");
                    double newPrice = scanner.nextDouble();

                    currentProduct.setName(newName);
                    currentProduct.setPrice(newPrice);

                    dao.update(currentProduct);

                    System.out.println("Producto actualizado");

                    break;

                case 4:
                    // Eliminar producto
                    System.out.print("Id del producto a eliminar: ");
                    id = scanner.nextInt();

                    dao.delete(id);
                    System.out.println("Producto eliminado");
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        } while(option != 5);

    }
}
