package Unit8.com.company.vehicles;

import Unit8.com.company.details.Engine;
import Unit8.com.company.professions.Driver;

public class Car {
    String brand;
    String category;
    int mass;
    Driver driver;
    Engine engine;

    void start(){
        System.out.println("Поехали!");
    }
    void stop(){
        System.out.println("Стоп.");
    }
    void turnRight(){
        System.out.println("поворот на право");
    }
    void turnLeft(){
        System.out.println("поворот на лево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", mass=" + mass +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

}
