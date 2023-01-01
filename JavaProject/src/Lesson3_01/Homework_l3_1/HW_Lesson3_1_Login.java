package Lesson3_01.Homework_l3_1;

import java.util.Scanner;

public class HW_Lesson3_1_Login {
    public static void main(String[] args) {

        String username = "Admin";
        String password = "P@ssword";

        Scanner input = new Scanner(System.in);
        System.out.println("Введите логин");

        if (input.nextLine().equals(username)) {
            System.out.println("Введите пароль");
            if (input.nextLine().equals(password)) {
                System.out.println("Здравствуйте " + username + ", Вы вошли в систему.");
            }
            else {
                System.out.println("Вы ввели неверный пароль!");
            }
        }
        else {
            System.out.println("Нет пользователя с таким именем!");
        }

        input.close();

    }
}
