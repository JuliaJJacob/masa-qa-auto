package Lesson5.arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int arrayOfNaumbers[] = {1, 2, 3, 4, 5 ,6, 7, 8 ,9, 10};

        //itar
        for (int i = 0; i < arrayOfNaumbers.length; i++) {
            int arrayOfNaumber = arrayOfNaumbers[i];
            System.out.print(arrayOfNaumbers[i] + " ");
        }

        System.out.println();
        //iter
        for (int number : arrayOfNaumbers) {
            System.out.print(number + " ");
        }
    }
}
