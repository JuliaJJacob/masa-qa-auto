package Lesson5.arrays;

public class ArrayException {
    public static void main(String[] args) {

        int array[] = {1, 2, 3};

        for (int i = 0; i <= /*mistake*/ array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
