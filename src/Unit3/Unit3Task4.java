package Unit3;
//Найти наибольший элемент и его порядковый номер в массиве

import java.util.Random;

public class Unit3Task4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[10];
        int max = array[0];
        int position = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(20);
            System.out.print(array[i] + " ");
            if(array[i]>max){
                max = array[i];
                position = i;
            }
        }
        System.out.println("\nМаксимальный элемент массива имеет индекс " + position + " и = " + max);
    }
}
