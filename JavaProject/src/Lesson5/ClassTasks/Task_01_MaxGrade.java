package Lesson5.ClassTasks;

import java.util.Random;

public class Task_01_MaxGrade {
    public static void main(String[] args) {

        Random random = new Random();
        String names[] = {"Ira", "Roma", "Gleb", "Karina", "Egor"};
        int grades[] = new int[5];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(100);
        }

        int maxGrade = grades[0];
        int index = 0;

        for (int i = 0; i < grades.length; i++) {
            System.out.println(names[i] + " " + grades[i]);
        }

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > maxGrade){
                maxGrade = grades[i];
                index = i;
            }
        }

        System.out.println("Best score: " + names[index] + " Grade: " + grades[index]);
        
// 
    }
}
