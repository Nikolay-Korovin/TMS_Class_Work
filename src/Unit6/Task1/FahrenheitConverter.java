package Unit6.Task1;

public class FahrenheitConverter extends BaseConverter {
    @Override
    double convert(double from) {
        System.out.println("Convert to fahrenheit");
        return from * 10;
    }
}
