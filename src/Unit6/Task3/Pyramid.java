package Unit6.Task3;

public class Pyramid extends Shape {
    double height;
    double square;
    String name = "Pyramid";

    public String getName() {
        return name;
    }

    Pyramid(double volume) {
        this.volume = volume;
    }

    Pyramid(double height, double square) {
        this.volume = (height * square) / 3;
    }
}
