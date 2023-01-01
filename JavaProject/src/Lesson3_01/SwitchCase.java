package Lesson3_01;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in 1-3:");

        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Num 1");
                break;
            case 2:
                System.out.println("Num 2");
                break;
            case 3:
                System.out.println("Num 3");
                break;
            default:
                System.out.println("Wrong number...");
        }

        input.close();
    }
}
