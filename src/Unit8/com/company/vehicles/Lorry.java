package Unit8.com.company.vehicles;

public class Lorry extends Car{
    int cargo;

    @Override
    public String toString() {
        super.toString();
        return super.toString() +"Lorry{" +
                "cargo=" + cargo +
                '}';
    }
}
