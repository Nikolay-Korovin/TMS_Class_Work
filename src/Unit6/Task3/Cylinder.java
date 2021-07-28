package Unit6.Task3;

public class Cylinder extends SolidOfRevolution{
    double height;
    Cylinder(double volume){
        this.volume = volume;
    }
    Cylinder(int height, int radius){
        this.volume = Math.PI * (Math.pow(radius,2)) * height;
    }
}
