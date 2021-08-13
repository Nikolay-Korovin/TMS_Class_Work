package Unit8.Shape;

import java.util.Objects;

public class Rectangle extends Shape{
    int x;
    int y;
    @Override
    void draw() {
        System.out.println("рисую треугольник");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return x == rectangle.x && y == rectangle.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y);
    }
}
