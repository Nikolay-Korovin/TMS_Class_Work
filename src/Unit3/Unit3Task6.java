package Unit3;
//Сдвиг массива
//Сдвинуть элементы массива в указанном направлении (влево или вправо) и на указанное число шагов.
//Освободившиеся ячейки заполнить нулями. Выводить массив после каждого шага.

import java.util.Random;

public class Unit3Task6 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[10];
        int step = 3;//без ввода в консоль, тупо хардкод так то!

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < Math.abs(step); i++) {
            if (step < 0) {
                int num1 = array.length - 1;
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[num1] = 0;

            } else {
                int num2 = 0;
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[num2] = 0;
            }

            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }
}

