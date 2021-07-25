package Unit3;
//Максимальный отрицательный элемент массива
//В массиве найти максимальный отрицательный элемент. Вывести на экран его значение и позицию в массиве.

import java.util.Random;

public class Unit3Task2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[10];
        int min = -20;
        int max = 20;
        int maxNegative = array[0];
        int position = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt((max - min) + 1) + min;
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                maxNegative = array[i];
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0 && array[i]>maxNegative){
                maxNegative = array[i];
                position = i;
            }
        }
        System.out.println("\nМаксимальный отрицательный элемент массива имеет индекс " + position + " и = " + maxNegative);
    }
}
