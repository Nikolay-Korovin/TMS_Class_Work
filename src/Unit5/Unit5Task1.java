package Unit5;

class Main {
    public static void main(String[] args) {
        Unit5Task1 S1 = new Unit5Task1(12);
        S1.method1();
    }
}

public class Unit5Task1 {
    int version;

    Unit5Task1(int version){
        this.version = version;
    }

    void method1(){
        System.out.println("Hello Java");
        System.out.println(method2());
    }
    int method2(){
        return version * 2;
    }
}