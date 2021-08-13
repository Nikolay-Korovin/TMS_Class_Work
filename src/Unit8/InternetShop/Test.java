package Unit8.InternetShop;

public class Test {
    public static void main(String[] args) {
        Product potato = new Product("potato",15,4.5);
        Product carrot = new Product("carrot",30,4.7);
        Product toyCar = new Product("transformer",100,3);
        Product lego = new Product("lego constructor",1000,5);

        Category vegetables = new Category("vegetables",new Product[]{potato,carrot});
        Category toys = new Category("toys",new Product[]{toyCar,lego});

        Basket basket = new Basket(potato,toyCar);

        User user = new User("Alfa",123,basket);
        System.out.println(user.basket.products[0].name);

    }
}
