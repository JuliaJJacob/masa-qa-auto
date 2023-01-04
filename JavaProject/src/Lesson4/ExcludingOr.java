package Lesson4;

public class ExcludingOr {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        System.out.println(a + " ^ " + b + " = " + (a ^ b));
        System.out.println(a + " ^ " + c + " = " + (a ^ c));

    }
}
