package Unit6.Task3;

public class Test {
    public static void main(String[] args) {
        Box box = new Box(1400);
        box.add(new Pyramid(10,15), new Cylinder(100), new Box(100));
    }
}
