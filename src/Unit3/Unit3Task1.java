package Unit3;

//Среднее арифметическое положительных элементовмассива
import java.util.Random;

public class Unit3Task1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[10];
        int min = -20;
        int max = 20;
        int counter = 0;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt((max - min) + 1) + min;
            System.out.print(array[i] + " ");
            if(array[i] > 0){
                sum += array[i];
                counter++;
            }
        }
        System.out.println("\nСреднее арифметическое положительных элементов массива = " + sum / counter);
    }
}
