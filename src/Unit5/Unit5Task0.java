package Unit5;

public class Unit5Task0 {
    public static void main(String[] args) {
        Unit5Task0 S1 = new Unit5Task0();
        System.out.println(S1.method1(10, 5));
        S1.method2(10, 20, 0);
    }

    double method1(double i, double j) {
        double answer = i / j;
        return answer;
    }

    void method2(int x, int y, int z) {
        System.out.println(x + " " + y + " " + z);
    }
}
