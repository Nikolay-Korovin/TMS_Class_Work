package Unit5.Task2;

public class Car {
    String model;
    int speed;
    Car(String model, int speed){
        this.speed = speed;
        this.model = model;
    }
    void info(){
        System.out.println(this.model + " скорость " + this.speed);
    }
}
