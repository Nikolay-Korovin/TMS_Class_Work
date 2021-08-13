package Unit8.Shape;

import java.util.Objects;

public class Circle extends Shape{
    int x;
    int y;
    @Override
    void draw() {
        System.out.println("рисую круг");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y);
    }
}
