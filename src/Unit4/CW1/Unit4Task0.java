package Unit4.CW1;

import java.util.Random;
import java.util.Scanner;

//Количество двузначных чисел в матрице
//Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.
public class Unit4Task0 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] array;
        int counter = 0;
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
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rd.nextInt(1000);
                System.out.print(array[i][j] + " ");
                if(array[i][j] > 9 && array[i][j] < 100){
                    counter++;
                }
            }
            System.out.println();
        }
        System.out.println("Количество двузначных чисел в матрице = " + counter);
    }
}
