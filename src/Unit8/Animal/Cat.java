package Unit8.Animal;

public class Cat extends Animal{
    int lifes;
    Cat(String food, String location, int lifes){
        this.food = food;
        this.location = location;
        this.lifes = lifes;
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(" кошка");
    }

    @Override
    void makeNoise() {
        System.out.println("meow");
    }

}