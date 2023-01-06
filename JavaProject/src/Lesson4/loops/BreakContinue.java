package Lesson4.loops;

public class BreakContinue {
    public static void main(String[] args) {

        var a = 0;

        while (a < 20){

            a++;

            if (a % 5 == 0){
                continue; // тут мы пропустили значение 5 и пошли дальше не обрабатывая его
            }

            if (a == 13){
                break; // тут вы остановились до дначения 13
            }
            System.out.println(a + " ");

        }
    }
}
