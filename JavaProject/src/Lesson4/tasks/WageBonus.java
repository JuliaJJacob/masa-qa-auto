package Lesson4.tasks;

import java.util.Scanner;

public class WageBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double bonus = 0.0;

        System.out.println("Your wage");
        double currentWage = input.nextDouble();

        System.out.println("Your experience");
        int experience = input.nextInt();

        // Если выслуга до 5 лет, премия составляет 10% от заработной платы.
        if (experience >= 0 && experience < 5) {
            bonus = currentWage * 0.1;

        }
        //Если выслуга от 5 лет (включительно) до 10 лет, премия составляет 15% от заработной платы.
        else if (experience >= 5 && experience < 10) {
            bonus = currentWage * 0.15;

        }
        //Если выслуга от 10 лет (включительно) до 15 лет, премия составляет 25% от заработной платы.
        else if (experience >= 10 && experience < 15) {
            bonus = currentWage * 0.25;

        }
        else {
            System.out.println("No bonus");
        }
        System.out.println("bonus = " + bonus);
        System.out.println("currentWage = " + (currentWage + bonus));


    }
}
