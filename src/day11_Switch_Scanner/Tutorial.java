package day11_Switch_Scanner;

import java.util.*;

class Main {
    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds:");

        int seconds = scanner.nextInt();
        int S = seconds % 60;
        int H = seconds / 60;
        int M = H % 60;
        H = H / 60;

        System.out.print(H + " hours, " + M + " minutes, and " + S + " seconds");
        System.out.print("\n");
    }}