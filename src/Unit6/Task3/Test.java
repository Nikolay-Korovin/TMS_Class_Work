package Unit6.Task3;

public class Test {
    public static void main(String[] args) {
        Box box = new Box(1000);

        box.add(new Pyramid(900));
        box.add(new Cylinder(100));

        for (int i = 0; i < box.counter; i++) {
            System.out.println(box.boxArray[i].getVolume());
            System.out.println(box.boxArray[i].getClass());
        }
    }
}
