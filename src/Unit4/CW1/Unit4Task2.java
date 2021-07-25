package Unit4.CW1;

//Индексы минимальных элементов матрицы
//Вывести на экран индексы минимальных элементов матрицы в данной строке

import java.util.Random;
import java.util.Scanner;

public class Unit4Task2 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] array;

        System.out.println("Введите размерность матрицы");
        while (true) {
            if (sc.hasNextInt()) {
                int size = sc.nextInt();
                if (size > 0) {
                    array = new int[size][size];
                    break;
                }
            } else {
                sc.next();
            }
        }

        for (int i = 0; i < array.length; i++) {
            int index = 0;
            int min = Integer.MAX_VALUE;
            System.out.print("В строке " + i + " [ ");

            for (int j = 0; j < array.length; j++) {
                array[i][j] = rd.nextInt(50);
                if (array[i][j] < min) {
                    min = array[i][j];
                    index = j;
                }
                System.out.print(array[i][j] + " ");
            }

            System.out.print("] " + " индекс минимального значения: ");
            System.out.print(index);
            System.out.println();
        }
    }
}
