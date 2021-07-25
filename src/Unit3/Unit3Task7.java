package Unit3;
//Вывести неповторяющиеся элементы массива
//В массиве найти элементы, которые в нем встречаются только один раз, и вывести их на экран.
//То есть найти и вывести уникальные элементы массива.

import java.util.Random;

public class Unit3Task7 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[10];
        int[] array1 = new int[array.length];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nУникальные элементы массива : ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j & array[i] == array[j]) {
                    array1[i]++;
                    if (index < array1[j]) {
                        index = j;
                    }
                }
            }
            if (array1[i] == 0) {
                System.out.print(array[i] + " ");
            }
        }


    }
}
