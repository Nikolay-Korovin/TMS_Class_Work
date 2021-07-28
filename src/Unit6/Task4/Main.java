package Unit6.Task4;

public class Main {
    public static void main(String[] args) {
        Printable[] printableArray = new Printable[]{new Book("Foundation and Empire"), new Magazine("Play Boy")};

        for (int i = 0; i < printableArray.length; i++) {
            printableArray[i].print();
        }

        Book.printBooks(printableArray);
        Magazine.printMagazines(printableArray);
    }
}
