package Unit4.CW1;
//Поменять столбцы матрицы местами
//В числовой матрице поменять местами два столбца, т. е. все элементы одного столбца
//поставить на соответствующие им позиции другого, а его элементы второго переместить в первый.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Unit4Task3 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] array;
        System.out.println("Введите чётную размерность матрицы ");
        while (true) {
            if (sc.hasNextInt()) {
                int size = sc.nextInt();
                if (size > 0 && size % 2 == 0) {
                    array = new int[size][size];
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

        int temp;
        for (int j = 0; j <= array.length / 2; j += 2) {
            for (int i = 0; i < array.length; i++) {
                temp = array[i][j];
                array[i][j] = array[i][j + 1];
                array[i][j + 1] = temp;
            }
        }

        System.out.println("соседние столбцы поменялись местами ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}

