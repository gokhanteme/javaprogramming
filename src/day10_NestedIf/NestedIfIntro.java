package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 95;
        if (score > 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid score");


        }
        System.out.println("-------------------------------");
        int age = 25;
        boolean haId = false;
        if (haId) {
            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eliginle to buy alcohol");
            }

        } else {
            System.out.println("You must have an ID to buy alcohol");
        }
        System.out.println("------------------------------");

        int number = 25;
        if (number >= 1 && number <= 7) {
            if (number == 1) {
                System.out.println("The day is monday");
            } else if (number == 2) {
                System.out.println("The day is tuesday");

            } else if (number == 3) {
                System.out.println("The day is wednesday");


            } else if (number == 4) {
                System.out.println("The day is thursday");
            } else if (number == 5) {
                System.out.println("The day is friday");
            } else if (number == 6) {
                System.out.println("The day is saturday");
            } else if (number == 7) {
                System.out.println("The day is sunday");
            }
            }else {
            System.out.println("Invalid Number");
        }
    }
}

