package Lesson3_01;

import java.util.Scanner;

public class MinMaxAverage {
    public static void main(String[] args) {

        double a;
        double b;
        double c;

        double min;
        double max;
        double avg;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number");
        a = scanner.nextDouble();
        System.out.println("Enter 2 number");
        b = scanner.nextDouble();
        System.out.println("Enter 3 number");
        c = scanner.nextDouble();

        avg = (a + b + c)/3;
        System.out.println("avg = " + avg);

        max = (a >= b) ? a : b;
        max = (max >= c) ? max : c;

        min = (a <= b) ? a : b;
        min = (min <=c) ? min : c;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
