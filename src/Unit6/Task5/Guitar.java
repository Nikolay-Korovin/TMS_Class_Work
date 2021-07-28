package Unit6.Task5;

public class Guitar implements Instrument {
    int numbersOfStrings;
    String name = "Guitar";
    Guitar(int numbersOfStrings){
        this.numbersOfStrings = numbersOfStrings;
    }

    public int getNumbersOfStrings() {
        return numbersOfStrings;
    }

    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("Играет " + getName() + " с " + getNumbersOfStrings() + " струнами.");
    }
}
