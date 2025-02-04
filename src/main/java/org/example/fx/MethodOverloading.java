package org.example.fx;

public class MethodOverloading {

    public static void main(String[] args) {



        System.out.println("The maximum is: " + maxNumber(10, 23, 43));

    }

    public static int maxNumber(int n1, int n2) {

        int local = 12;

        if (n1 >= n2) {
            return n1 * local;
        }
        return n2;
    }

    public static int maxNumber(int n1, int n2, int n3) {
        if (n1 >= n2 && n1 >= n3) {
            return n1;
        }
        if (n2 >= n1 && n2 >= n3) {
            return n2;
        }

        return n3;
    }
}
