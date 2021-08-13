package Unit8.Animal;

public class Horse extends Animal{
    int speed;
    Horse(String food, String location, int speed){
        this.food = food;
        this.location = location;
        this.speed = speed;
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(" лошадь");
    }

    @Override
    void makeNoise() {
        System.out.println("igogo");
    }

}