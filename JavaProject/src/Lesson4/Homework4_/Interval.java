package Lesson4.Homework4_;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write your number: ");
        int num = input.nextInt();

        if (num >= 0 && num < 15) {
            System.out.println("Interval 0-14");
        }
        else if (num >=15 && num <= 35){
            System.out.println("Interval 15-35");
        }
        else if (num >=36 && num <= 50){
            System.out.println("Interval 36-50");
        }
        else if (num >=51 && num <= 100){
            System.out.println("Interval 51-100");
        }
        else System.out.println("Not in the interval");

        input.close();



    }
}
