package Unit6.Task4;

public class Book implements Printable{
    String name;
    Book(String name){
        this.name = name;
    }

    public static void printBooks(Printable[] printable){
        for (int i = 0; i < printable.length; i++) {
            if(printable[i] instanceof Book){
                printable[i].print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Book: " + name);
    }
}
