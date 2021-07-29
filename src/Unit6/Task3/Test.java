package Unit6.Task3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int counter = 0;
        Box box = new Box(500);
        box.add(new Pyramid(10,15), new Cylinder(10), new Pyramid(10));
        for (int i = 0; i < 41; i++) {
            box.add(new Pyramid(10));
        }
        box.add(new Pyramid(10,15), new Cylinder(15), new Pyramid(14));

        for (int i = 0; i < box.boxArray.length; i++) {
            System.out.println(box.boxArray[i] + " " + ++counter);
        }
    }
}
