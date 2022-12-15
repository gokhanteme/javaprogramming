package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {
        int d = 1;


        if (d == 1) {
            System.out.println("The day is monday");
        } else if (d == 2) {
            System.out.println("The day is tuesday");
        } else if (d == 3) {
            System.out.println("The day is wednesday");

        } else if (d == 4) {
            System.out.println("The day is thursday");
        } else if (d == 5) {
            System.out.println("The day is friday");
        } else if (d == 6) {
            System.out.println("The day is saturday");
        } else if (d == 7) {
            System.out.println("The day is sunday");
        } else {
            System.out.println("Please, write to 1-7 numbers.");

        }

        System.out.println("----------------------------------------");
        String result1 = (d == 1) ? "Monday" : (d == 2) ? "Tuesday" : (d == 3) ? "Wednesday" : (d == 4) ? "Thursday" : (d == 5) ? "Friday" : (d == 6) ? "Saturday" : (d == 7) ? "Sunday" : "please write to 1~7 numbers";
        System.out.println(result1);

        System.out.println("----------------------");
        if (d == 1) {
            System.out.println("The day is monday");


        }
    }
}
