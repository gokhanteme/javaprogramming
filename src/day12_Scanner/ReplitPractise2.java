package day12_Scanner;

import java.util.Scanner;

public class ReplitPractise2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter seconds:");
        int inputSeconds = scan.nextInt();

        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds % 3600) / 60;
        int seconds = inputSeconds % 60;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");

        scan.close();


    }
}
