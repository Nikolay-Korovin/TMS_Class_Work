package Unit6.Task4;

public class Magazine implements Printable{
    String name;
    Magazine(String name){
        this.name = name;
    }

    public static void printMagazines(Printable[] printable){
        for (int i = 0; i < printable.length; i++) {
            if(printable[i] instanceof Magazine){
                printable[i].print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + name);
    }
}
