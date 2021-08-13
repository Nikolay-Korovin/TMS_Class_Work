package Unit8.Shape;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{new Circle(),new Rectangle()};
        for (Shape shape:shapes) {
            shape.draw();
        }
        System.out.println(new Circle().equals(new Circle()));
    }
}
