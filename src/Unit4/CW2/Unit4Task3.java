package Unit4.CW2;
//Дан целочисленный массив В[n, n], где n вводите с клавиатуры.
// Заполнить его случайными числами от -10  до 100.
// Напечатать индексы его отрицательных элементов

import java.util.Random;
import java.util.Scanner;

public class Unit4Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[][] array;
        int min = -10;
        int max = 100;

        System.out.println("Введите размерность массива");
        while (true) {
            if (sc.hasNextInt()) {
                int size = sc.nextInt();
                array = new int[size][size];
                break;
            } else {
                sc.next();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = rd.nextInt(max - min) + 1 + min;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][j] < 0){
                    System.out.print("(" + i + " " + j + ")");
                }
            }
        }
    }
}
