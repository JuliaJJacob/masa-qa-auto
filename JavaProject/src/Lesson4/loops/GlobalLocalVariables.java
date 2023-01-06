package Lesson4.loops;

public class GlobalLocalVariables {
    public static void main(String[] args) {

        String textOutside = "Outside Loop";
        System.out.println("textOutside = " + textOutside); //более глобальный уровень переменной

        for (int i = 0; i < 1; i++) {
            textOutside = "We are inside loop now";
            int a = 5; // более локальный уровень переменной
            System.out.println("a = " + a);
        }
        System.out.println("textOutside = " + textOutside);

        //суть: мы вошли в новую интерацию для переменной
        // переменную А из цикла мы тут уже вызвать не можем, она существует только там

    }
}
