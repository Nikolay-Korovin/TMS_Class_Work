package Unit8.Animal;

public abstract class Animal {
    String food;
    String location;
    abstract void makeNoise();
    void eat(){
        System.out.print("ест");
    }
    void sleep() {
        System.out.print("спит");
    }

}
