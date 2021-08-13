package Unit8.InternetShop;

public class User {
    private String login;
    private int passWord;
    Basket basket;

    public User(String login, int passWord, Basket basket) {
        this.login = login;
        this.passWord = passWord;
        this.basket = basket;
    }
}
