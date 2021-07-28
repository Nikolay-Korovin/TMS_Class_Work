package Unit6.Task5;

public class Toobe implements Instrument {
    int diameter;
    String name = "Toobe";
    Toobe(int diameter){
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("Играет " + getName() + " с " + getDiameter() + " диаметром.");
    }
}
