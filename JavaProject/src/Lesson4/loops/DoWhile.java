package Lesson4.loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        do {
            System.out.println("before a++ = " + a);
            a++;
            System.out.println("after a++ = " + a);
        }
        while (a < 10);
    }
}
