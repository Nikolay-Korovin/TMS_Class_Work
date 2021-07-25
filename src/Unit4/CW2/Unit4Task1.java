package Unit4.CW2;
//Заполнить двумерный массив случайными  числами от 10  до 100.
//Посчитать сумму элементов отдельно в каждой строке и определить номер строки,  в которой эта сумма максимальна.

import java.util.Random;

public class Unit4Task1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] array = new int[4][4];
        int minValue = Integer.MIN_VALUE;
        int index = 0;
        int sum;
        int result = 0;
        int min = 10;
        int max = 100;

        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array.length; j++) {
                array[i][j] = rd.nextInt(max - min) + 1 + min;
                System.out.print(array[i][j] + " ");
                sum += array[i][j];
            }
            System.out.println();
            if (sum > minValue) {
                minValue = sum;
                index = i;
            }
            result = minValue;
        }
        System.out.println("Максимальная сумма в строке " + (index + 1) + " = " + result);
    }
}
