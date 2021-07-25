package Unit4.CW2;
//Объявить двумерный массив и заполнить его построчно с клавиатуры.
//После заполнения – показать заполненную матрицу на экран и
//посчитать сумму элементов отдельно в каждом столбце и каждой строке.

import java.util.Scanner;

public class Unit4Task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array;
        int size;
        System.out.println("Введите размерность массива");

        while (true) {
            if (sc.hasNextInt()) {
                size = sc.nextInt();
                array = new int[size][size];
                break;
            } else {
                sc.next();
            }
        }

        System.out.println("Вводите элементы массива");

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + " строка из " + array.length + " количество элементов " + array.length);
            for (int j = 0; j < array.length; j++) {
                while (true) {
                    if (sc.hasNextInt()) {
                        array[i][j] = sc.nextInt();
                        break;
                    } else {
                        sc.next();
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            int sum2 = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
                sum2 += array[j][i];
            }
            System.out.println("Сумма элементов в " + (i + 1) + " строке = " + sum);
            System.out.println("Сумма элементов в " + (i + 1) + " столбце = " + sum2);
        }

    }
}
