package Unit3;
//Число, чаще всего встречающееся в массиве
//Определить, какое число в массиве встречается чаще всего.

import java.util.Random;

public class Unit3Task3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[10];
        int[] array1 = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(20);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j & array[i] == array[j]) {
                    array1[i]++;
                    if (index < array1[j]) {
                        index = j;
                    }
                }
            }
        }
        if (index == 0) {
            System.out.println("Всех чисел по одному варианту на весь массив");
        } else {
            System.out.print("Самое часто встречающееся число в массиве: " + array[index]);
        }

    }
}
