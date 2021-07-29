package Unit6.Task3;

import java.util.Arrays;
//проверка того что всё работает
public class Test {
    public static void main(String[] args) {
        int counter = 0;
        Box box = new Box(1000);
        box.add(new Pyramid(20), new Cylinder(30), new Pyramid(15));
        box.add(new Pyramid(20), new Cylinder(30), new Pyramid(15));
        for (int i = 0; i < 100; i++) {
            box.add(new Cylinder(5));
        }
        for (int i = 0; i < box.boxArray.length; i++) {
            if(box.boxArray[i] != null) {
                System.out.println(box.boxArray[i].getVolume() + " " + ++counter);
            }
        }
        System.out.println(Arrays.toString(box.boxArray));
    }
}
