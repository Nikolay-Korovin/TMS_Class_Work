package Unit3;
//Поменять местами минимальный и максимальный элементы

import java.util.Random;

public class Unit3Task5 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[10];
        int max = array[0];
        int min = array[0];
        int maxInd = 0;
        int minInd = 0;
        int temp;

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(20);
            System.out.print(array[i] + " ");
            if(array[i] > max){
                max = array[i];
                maxInd = i;
            }
            if(array[i] < min){
                min = array[i];
                minInd = i;
            }
        }

        temp = array[maxInd];
        array[maxInd] = array[minInd];
        array[minInd] = temp;

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
