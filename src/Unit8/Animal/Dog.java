package Unit8.Animal;

public class Dog extends Animal{
    String color;
    Dog(String food, String location, String color){
        this.food = food;
        this.location = location;
        this.color = color;
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(" собака");
    }

    @Override
    void makeNoise() {
        System.out.println("Woof");
    }

}
