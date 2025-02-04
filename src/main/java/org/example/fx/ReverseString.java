package org.example.fx;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any string: ");
        String input = scanner.nextLine();

        String reverseString = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            reverseString += c;
        }

        System.out.println("The reverse string is: " + reverseString);

    }
}
