package Lesson5;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class RandomValues {
    public static void main(String[] args) {

        Random random = new Random();
        ThreadLocalRandom ThreadLocalRandom = java.util.concurrent.ThreadLocalRandom.current();

//        int randomInteger = random.nextInt();
//        int randomIntWithBound = random.nextInt(10);
//        double randomDoube = random.nextDouble();

//        System.out.println("randomInteger = " + randomInteger);
//        System.out.println("randomIntWithBound = " + randomIntWithBound);
//        System.out.println("randomDoube = " + randomDoube);

        int randomIntWithBound = ThreadLocalRandom.nextInt(10, 20); // границы рандома
        System.out.println("randomIntWithBound = " + randomIntWithBound);


    }
}
