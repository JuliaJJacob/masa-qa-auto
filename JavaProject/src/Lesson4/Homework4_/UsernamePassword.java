package Lesson4.Homework4_;

import java.util.Objects;
import java.util.Scanner;

public class UsernamePassword {
    public static void main(String[] args) {

        String username = "Admin";
        String password = "Password";
        int variant = 1;

        System.out.println("Enter your login");
        Scanner input = new Scanner(System.in);
        String yourUsername = input.nextLine();
        //String yourPassword = input.nextLine();

        while (!yourUsername.equals(username) && variant < 6) {
            System.out.println("Incorrect login. Enter again");
            yourUsername = input.nextLine();
            variant++;
        }


        if (!yourUsername.equals(username)) {
            System.out.println("Access restricted. Too many attempts");
            input.close();
        }

        if (yourUsername.equals(username)){
            System.out.println("Enter your password");
            String yourPassword = input.nextLine();
            variant = 1;
            while (!yourPassword.equals(password) && variant < 6) {
                System.out.println("Incorrect password. Enter again");
                yourPassword = input.nextLine();
                variant++;
            }

            if (!yourPassword.equals(password)) {
                System.out.println("Access restricted. Too many attempts");
                input.close();
            } else {
                System.out.println("Logged in as " + username);
            }
        }


        input.close();


    }
}
