package Unit3;

import java.util.Random;

//Реверс массива
public class Unit3Task8 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[10];
        int[] array1 = new int[10];

        for (int i = 0, j = array.length-1; i < array.length; i++, j--) {
            array[i] = rd.nextInt(20);
            System.out.print(array[i] + " ");
            array1[j] = array[i];
        }

        System.out.println();
        System.out.println("Реверс первого массива");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
