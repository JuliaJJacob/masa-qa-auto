package Lesson4.Homework4_;

public class Average {
    public static void main(String[] args) {

        double sum = 0;
        double average;

        for (int i = 0; i < 101; i++) {
            sum = sum + i;

        }
        average = sum / 100;
        System.out.println("Average sum (1-100) = " + average);
    }
}
