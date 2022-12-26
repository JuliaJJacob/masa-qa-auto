package Lesson3.Homework_l3;

public class Homework_lesson3 {
    public static void main(String[] args) {

        // Part 1
        System.out.println("\tPart 1");
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println("Task 1");
        System.out.println("result = " + result);

        int a = 5;
        int b = 8;
        int result_A = a-- - --a + ++a + a++ + a;
        int result_B = ++b - b++ + ++b - --b;
        System.out.println("Task 2");
        System.out.println("result_A = " + result_A);
        System.out.println("result_B = " + result_B);

        // Part 2
        int x = 10;
        int y = 12;
        int z = 3;
        System.out.println("\tPart 2");
        x += y - (x++ * z);
        System.out.println("x = " + x);
        z = --x - y * 5;
        System.out.println("z = " + z);
        y /= x + 5 % z;
        System.out.println("y = " + y);
        z = x++ + y * 5;
        System.out.println("z = " + z);
        x = y - x++ * z;
        System.out.println("x = " + x);


    }
}
