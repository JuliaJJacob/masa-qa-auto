package Lesson3_01;

public class Ternar_operators {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 6;
        String result;

//        if (a == b) {
//            result = "a anb are equal";
//        }
//        else {
//            result = "a anb are NOT equal";
//        }
        result = (a == b) ? "a anb are equal" : "a anb are NOT equal";
        System.out.println("result = " + result);

        result = (a == c) ? "a anb are equal" : "a anb are NOT equal";
        System.out.println("result = " + result);

        result = (a == c) ? "a anb are equal" : (a > c) ? "a > c" : "c > a";
        System.out.println("result = " + result);
        //if () ? thing : else if () ? thing : else thing



    }
}
