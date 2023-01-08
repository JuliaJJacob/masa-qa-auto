package Lesson5.collections;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> myArrayList = new ArrayList<>(); // не можем исп примитивные типы данных

        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.add(5);
        System.out.println("myArrayList.size() = " + myArrayList.size());

        for (Integer number : myArrayList) {
            System.out.println(number);
        }

        //         myArrayList.add(9,10); -на опр строку и опр параметр .set -перезаписать существующий

        for (int i = 0; i < 15; i++) {
            myArrayList.add(i);
        }
        System.out.println("myArrayList.size() = " + myArrayList.size());


    }
}
