package Unit6.Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box extends Shape {
    int mainCounter =0;
    private final int DEFAULT_SIZE = 10;
    Shape[] boxArray = new Shape[DEFAULT_SIZE];

    String name = "Box";

    Box(double volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    boolean add(Shape... shape) {
        int counter = 0;

        for (int i = counter; i < boxArray.length; i++) {
            if (boxArray[i] != null) {
                counter++;
            }
        }
        if (shape.length >= boxArray.length && volume > 0) {
            boxArray = Arrays.copyOf(boxArray, boxArray.length * 2);
        } else if (counter > boxArray.length - 4) {
            boxArray = Arrays.copyOf(boxArray, boxArray.length * 2);
        }

        if (volume > 0) {
            for (int i = 0; i < shape.length; i++) {
                    if (shape[i].getVolume() <= volume) {
                        System.out.println("Запихиваем в коробку " + shape[i].getName() + " обьёмом " + shape[i].getVolume());
                        volume = volume - shape[i].getVolume();
                        boxArray[mainCounter] = shape[i];
                        System.out.println("в коробке осталось " + getVolume());
                        mainCounter++;
                    }
            }
        }
        if (volume > 0) {
            return true;
        } else {
            return false;
        }
    }
}
