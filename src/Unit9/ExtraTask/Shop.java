package Unit9.ExtraTask;

import java.util.Arrays;

public class Shop {
    private int arrayPos = 0;
    private int add = 0;
    private Product[] products;
    public Shop() {
        products = new Product[1];
    }

    public Product[] getProducts() {
        return products;
    }

    void addProduct(Product... product) {
        if (product.length >= products.length) {
            products = Arrays.copyOf(products, (products.length * 2) + product.length);
        }
        for (int i = 0; i < product.length; i++) {
            products[arrayPos] = product[i];
            product[i].addQue = add;
            arrayPos++;
            add++;
        }
    }
    void deleteProduct(int id) {
        if (products[0] != null) {
            for (int i = 0; i < products.length; i++) {
                if (products[i] != null && products[i].id == id) {
                    products[i] = null;
                    arrayPos--;
                }
            }
            arraySort(products);
        } else {
            System.out.println("нет товаров");
        }
    }

    void changeProduct(Product product) {
        for (int i = 0; i < actualLength(); i++) {
            if(products[i].id == product.id){
                products[i].price = product.price;
                products[i].name = product.name;
            }
        }
    }

    Product[] priceSort(Product[] products) {

        for (int i = 0; i < actualLength() - 1; i++) {
            for (int j = i + 1; j < actualLength(); j++) {
                if (products[i].price > products[j].price) {
                    Product tmp = products[i];
                    products[i] = products[j];
                    products[j] = tmp;
                }
            }
        }
        return products;
    }
    Product[] lastAddedSort(Product[] products){
        for (int i = 0; i < actualLength() - 1; i++) {
            for (int j = i + 1; j < actualLength(); j++) {
                if (products[i].addQue < products[j].addQue) {
                    Product tmp = products[i];
                    products[i] = products[j];
                    products[j] = tmp;
                }
            }
        }
        return products;
    }

    public void showAllShop(){
        for (int i = 0; i < actualLength(); i++) {
            System.out.printf("Товар: %s id: %d цена: %d", products[i].name, products[i].id, products[i].price );
            System.out.println();
        }
        System.out.println();
    }
    private Product[] arraySort(Product[] products) {

        for (int i = 0; i < products.length - 1; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i] == null) {
                    Product tmp = products[i];
                    products[i] = products[j];
                    products[j] = tmp;
                }
            }
        }
        return products;
    }
    private int actualLength(){
        int actualLength = 0;
        for (Product product : products) {
            if (product != null) {
                actualLength++;
            }
        }
        return actualLength;
    }
}

