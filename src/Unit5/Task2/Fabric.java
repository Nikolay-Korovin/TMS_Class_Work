package Unit5.Task2;

public class Fabric {
    public static void main(String[] args) {
        Road road = new Road();
        Car car1 = new Car("Ferrari 430" , 300);
        Car car2 = new Car("Lada Vesta" , 150);
        road.run(car1);
        road.run(car2);
    }
}
