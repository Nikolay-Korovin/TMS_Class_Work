package Unit5;

import java.util.Arrays;

class MainClass {
    public static void main(String[] args) {
        Unit5Phone phone1 = new Unit5Phone(2241516, "Nokia", 10);
        Unit5Phone phone2 = new Unit5Phone(2241010, "iPhone", 120);
        Unit5Phone phone3 = new Unit5Phone(2249999, "Motorola", 50);

        phone1.display();
        phone2.display();
        phone3.display();

        phone1.recieveCall("Петя");
        phone2.recieveCall("Даша");
        phone3.recieveCall("Маша");
        phone1.recieveCall("Женя", 2003040);

        phone1.sendMessage(12, 14, 15);
    }
}

public class Unit5Phone {
    int number;
    String model;
    double weight;

    Unit5Phone() {
    }

    Unit5Phone(int number, String model) {
        this.model = model;
        this.number = number;
    }

    Unit5Phone(int number, String model, double weight) {
        this(number, model);
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    void recieveCall(String name) {
        System.out.println("Звонит " + name + " " + getNumber());
    }

    void recieveCall(String name, int number) {
        System.out.println("Звонит " + name + " " + number + " ");
    }

    void sendMessage(int... numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    void display() {
        System.out.println(this.model + " " + this.number + " " + this.weight);
    }

}
