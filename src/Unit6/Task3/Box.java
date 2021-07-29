package Unit6.Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box extends Shape {
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
        int counter2 = 0;
        int counter = 0;

        for (int i = counter2; i < boxArray.length; i++) {
            if (boxArray[i] != null) {
                counter2++;
            }
        }
        if (counter2 == boxArray.length - 5) {
            boxArray = Arrays.copyOf(boxArray, boxArray.length * 2);
        }
        if (shape.length >= boxArray.length && volume > 0) {
            boxArray = Arrays.copyOf(boxArray, boxArray.length * 2);
        }
        for (int i = 0; i < boxArray.length; i++) {
            if (boxArray[i] != null) {
                counter++;
            } else {
                break;
            }
        }

        if (volume > 0) {
            for (int i = 0; i < shape.length; i++) {
                if(shape[i].getVolume() < volume) {
                    System.out.println("Запихиваем в коробку " + shape[i].getName() + " обьёмом " + shape[i].getVolume());
                    volume = volume - shape[i].getVolume();
                    boxArray[i + counter] = shape[i];
                    System.out.println("в коробке осталось " + getVolume());
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
