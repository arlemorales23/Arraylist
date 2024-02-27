package ejemplo8;

import java.util.ArrayList;

public class ProductDAO {
    private ArrayList<Product> products;

    ProductDAO() {
        products = new ArrayList<>();
    }

    void save(Product product) {
        products.add(product);
    }

    Product get(int id) {
        Product product = products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);

        if(product == null) {
            throw new IllegalArgumentException("No existe un producto con el id: " + id);
        }

        return product;
    }

    void update(Product product) {
        products.set(products.indexOf(get(product.getId())), product);
    }

    void delete(int id) {
        products.remove(get(id));
    }
}
