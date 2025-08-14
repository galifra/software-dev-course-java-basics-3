package org.example;
import java.util.Scanner;

public class ConditionalExercises {

    public boolean lessThanFive(int num) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number ");
        num = input.nextInt();

        // Replace the line below with code that returns true if x is less than 5, and false otherwise
        // (use an if statement with an else block.)
        if (num < 5) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public String getAgeGroup(int age) {

        // Replace the line below with code that returns "child" if age is less than 13,
        // "teen" if age is less than 20, and "adult" otherwise
        // (use if, else if, and else)
        if (age >= 0 && age <= 12) {
            return "Child";
        } else if (age >= 13 && age <= 19) {
            return "Teen";
        } else if (age >= 20) {
            return "Adult";
        } else {
            return "Invalid age";
        }
    }

    public boolean isValidPassword(String password) {
        int passwordLength = password.length();

        // Replace the line below with code that returns true if password is at least 8 characters long
        // and false otherwise
        // (use an if statement with an else block.)
        if (passwordLength >= 8) {
            return true;
        } else {
            return false;
        }
    }
}
