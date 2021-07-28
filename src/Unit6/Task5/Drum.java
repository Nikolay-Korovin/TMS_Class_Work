package Unit6.Task5;

public class Drum implements Instrument {
    int size;
    String name = "Drum";
    Drum(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("Играет " + getName() + " с " + getSize() + " размером.");
    }
}
