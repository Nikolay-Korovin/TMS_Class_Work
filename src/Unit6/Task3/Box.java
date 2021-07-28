package Unit6.Task3;

public class Box extends Shape{
    int counter=0;
    Shape[] boxArray = new Shape[10];

    Box(double volume){
        this.volume = volume;
    }

    boolean add(Shape shape){
        if(volume >= shape.getVolume() && counter <=10){
            volume = volume - shape.getVolume();
            boxArray[counter] = shape;
            counter++;
            System.out.println("Оставшийся обьём коробки = " + volume);
            return true;
        }else{
            return false;
        }
    }
}
