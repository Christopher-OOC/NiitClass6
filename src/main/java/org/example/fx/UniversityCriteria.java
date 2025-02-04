package org.example.fx;

public class UniversityCriteria {
    public static boolean isAgeEligible(int age) {
        if (age >= 18) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int age = 19;
        int jambScore = 320;
        int height = 175;

        if (isAgeEligible(age) && isHeightEligible(height) && isJambScoreEligible(jambScore)) {
            System.out.println("You can apply!");
        }
        else {
            System.out.println("You cannot apply!");
        }

//        if (age >= 18 && jambScore >= 200 && height >= 170) {
//            System.out.println("You can apply!");
//        }
//        else {
//            System.out.println("You cannot apply!");
//        }
    }



    public static boolean isJambScoreEligible(int jambScore) {
        if (jambScore >= 200) {
            return true;
        }

        return false;
    }

    public static boolean isHeightEligible(int height) {
        if (height >= 170) {
            return true;
        }

        double an = x1(1);
        return false;
    }

    public static int x1(int i) {
        return 1;
    }
    public static double x1(double d) {
        return 1.0;
    }
}
