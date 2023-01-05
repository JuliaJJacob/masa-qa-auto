package Lesson4.tasks;

public class T3_NumDividedBy5 {
    public static void main(String[] args) {

        int a = 0;

        while (a <= 1000){
            if (a % 5 == 0){
                System.out.println("a = " + a);
            }
            a++; //не забудь шаг!!
        }
    }
}
