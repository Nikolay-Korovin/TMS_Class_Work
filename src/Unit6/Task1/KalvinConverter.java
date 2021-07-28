package Unit6.Task1;

public class KalvinConverter extends BaseConverter {
    @Override
    double convert(double from) {
        System.out.println("Convert to kalvin");
        return from * 5;
    }
}
