package Unit6.Task5;

public class Main {
    public static void main(String[] args) {
        Instrument[] array = new Instrument[]{new Drum(5), new Guitar(6), new Toobe(4)};
        for (int i = 0; i < array.length; i++) {
            array[i].play();
        }
    }
}
