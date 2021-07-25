package Unit3;
//Сумма четных положительных элементов массива
//В массиве, содержащем положительные и отрицательные целые числа, вычислить сумму четных положительных элементов.

import java.util.Random;

public class Unit3Task9 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[10];
        int min = -20;
        int max = 20;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt((max - min) + 1) + min;
            System.out.print(array[i] + " ");
            if(array[i] > 0 && array[i] % 2 == 0){
                sum+= array[i];
            }
        }
        System.out.println("\nСумма чётных положительных элементов массива = " + sum);
    }
}
