package org.example.fx;

import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.next();

        if (isPasswordValid(password)) {
            System.out.println("Password is valid!");
        }
        else {
            System.out.println("Password is not valid!");
        }
    }

    public static boolean isPasswordValid(String password) {
        if (is8CharacterLong(password) && containsOneDigit(password) && containsUppercase(password)) {
            return true;
        }

        return false;
    }

    public static boolean containsUppercase(String password) {
        String numbers = "0123456789";

        for (int i = 0; i < password.length(); i++) {
            String character = password.charAt(i) + "";
            String uppercase = (password.charAt(i) + "").toUpperCase();
            if (character.equals(uppercase) && !numbers.contains(character)) {
                return true;
            }

        }

        return false;
    }

    public static boolean containsOneDigit(String password) {
        String numbers = "0123456789";

        for (int i = 0; i < password.length(); i++) {
            if (numbers.contains(password.charAt(i) + "")) {
                return true;
            }

        }

        return false;
    }

    public static boolean is8CharacterLong(String password) {
        return password.length() >= 8 ? true : false;
    }
}
