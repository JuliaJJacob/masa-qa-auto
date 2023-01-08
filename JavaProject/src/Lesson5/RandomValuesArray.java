package Lesson5;

import java.util.Random;

public class RandomValuesArray {
    public static void main(String[] args) {

        Random random = new Random();

        int array[] = new int[100]; // пустой массив

//        int array[] = {5, 10, 15}; вариант написания массива с опр элементами

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt();
        } // заполнили его

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } // распечатали его

    }
}
