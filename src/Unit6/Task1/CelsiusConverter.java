package Unit6.Task1;

public class CelsiusConverter extends BaseConverter{
    @Override
    double convert(double from) {
        System.out.println("Convert to celsius");
        return from * 2;
    }
}
