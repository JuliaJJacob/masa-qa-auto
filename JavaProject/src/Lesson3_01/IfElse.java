package Lesson3_01;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        if (age > 18) {
            System.out.println("Adult detected");
        }
        else if (age == 18) {
            System.out.println("18 years old");
            System.out.println("Bye");
        }
        else {
            System.out.println("Baby detected");
        }

    }
}
