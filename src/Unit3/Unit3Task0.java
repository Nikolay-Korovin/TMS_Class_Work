package Unit3;
//Определить индексы чётных элементов массива

import java.util.Arrays;
import java.util.Random;

public class Unit3Task0 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[10];
        int[] array1;
        int oddCounter = 0;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(20);
            System.out.print(array[i] + " ");
            if(array[i] % 2 == 0 && array[i] != 0){
                oddCounter++;
            }
        }
        System.out.println(oddCounter);
        System.out.println();
        array1 = new int[oddCounter];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0){
                array1[counter] = i;
                counter++;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}

