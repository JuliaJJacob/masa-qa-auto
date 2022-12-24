package Lesson3;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 15;
        int b = 6;

        double c = 20;
        double d = 7;

        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));

        double result = (c/d);
        System.out.println("c / d = " + (c/d));
        System.out.println("result * d = " + (result * d));
        System.out.println("c % d = " + (c%d));

        double resultOfInt = a / b;
        double resultOfDouble = c / b;
        System.out.println("resultOfDouble = " + resultOfDouble);

    }
}
