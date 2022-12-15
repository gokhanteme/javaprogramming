package day12_Scanner;

import java.util.Scanner;

public class Practise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your speed:");
        double speedMiles = scan.nextDouble();

        double miles= speedMiles;
        double km = speedMiles * 1.609;

        System.out.println(km + " km");
        scan.close();





       /* System.out.println("Enter cents:");
        double inputCents = scan.nextDouble();

        double cents = inputCents;
        double dollars = inputCents / 100;


        System.out.println(dollars);
        scan.close();
*/
/*
        Write a program that can convert Miles to KM
        Ex:
        Enter miles:
        10.0
        output:
        10.0 miles equal to 16.09 kilometers
        */

    }
}
/*
Write a program that can convert cents to dollars, if there is any
remainder include them in the result as cents
Ex:
Enter cents
225
output:
225 cents equal to: 2 dollars and 25 cents
 */