package Unit4.CW1;
//Записать матрицу в одномерный массив
//Записать значения элементов прямоугольной матрицы в одномерный массив в порядке следования столбцов.

import java.util.Random;
import java.util.Scanner;

public class Unit4Task1 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] array;
        int[] array1;
        System.out.println("Введите размерность матрицы");
        while (true) {
            if (sc.hasNextInt()) {
                int size = sc.nextInt();
                if (size > 0) {
                    array = new int[size][size];
                    array1 = new int[size * size];
                    break;
                }
            } else {
                sc.next();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rd.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int index = 0;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                array1[index] = array[i][j];
                System.out.print(array1[index] + " ");
                index++;
            }
        }
    }
}
