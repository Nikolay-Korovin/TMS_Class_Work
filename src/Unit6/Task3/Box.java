package Unit6.Task3;

public class Box extends Shape {
    Shape[] boxArray;
    String name = "Box";

    Box(double volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    boolean add(Shape... shape) {
        boxArray = new Box[shape.length];
        for (int i = 0; i < boxArray.length; i++) {
            if (volume >= shape[i].getVolume()) {
                volume = volume - shape[i].getVolume();
                System.out.println("Впихиваем " + shape[i].getName() + " обьем = " + shape[i].getVolume());
                System.out.println("Оставшийся обьём коробки = " + volume);
            }
        }
        if (volume > 0) {
            return true;
        } else {
            return false;
        }
    }
}
