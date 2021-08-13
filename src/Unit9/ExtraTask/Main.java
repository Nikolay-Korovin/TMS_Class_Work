package Unit9.ExtraTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product product = new Product(13,1,"toy");
        Product product1 = new Product(12,100,"carrot");
        Product product2 = new Product(14,1000,"packet");
        Product product3 = new Product(14,700,"cheap packet");

        Product[] products = {product,product1,product2};
        shop.addProduct(products);
        shop.priceSort(shop.getProducts());
        shop.showAllShop();
        shop.lastAddedSort(shop.getProducts());
        shop.showAllShop();
        shop.deleteProduct(12);
        shop.showAllShop();
        shop.changeProduct(product3);
        shop.showAllShop();

    }
}
