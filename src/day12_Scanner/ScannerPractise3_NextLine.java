package day12_Scanner;

import java.util.Scanner;

public class ScannerPractise3_NextLine {
    public static void main(String[] args) {

        //123Enter
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yuor full name");
        String fullName =input.nextLine();// wooden spoon

        System.out.println("Enter your programming language");;
        String programming = input.nextLine();// Java Programming

        System.out.println("Enter your age");
        int age = input.nextInt();//age

        input.nextLine();//capture the key that user pressed for nextInt()

        System.out.println("Enter your school name ");
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
        input.close();


    }
}
