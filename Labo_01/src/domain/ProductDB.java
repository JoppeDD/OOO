package domain;

import java.util.ArrayList;

public class ProductDB {

    private ArrayList<Product> products = new ArrayList<Product>();

    private void addProduct(Product p) {
        products.add(p);
    }

    public double showPrice(int id, int nOfDays) {
        double price = 0;
        for (Product product : products) {
            if (product.getId() == id) {
                price = product.getPrice(nOfDays);
            }
        }
        return price;
    }
}
