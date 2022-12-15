package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your ful name");
        String fullName = scan.next();

        scan.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = scan.next();

        scan.nextLine();

        System.out.println("Enter your Street name");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name");
        String stateName = scan.nextLine();

        System.out.println("Enter your zip code");
        String zipCode = scan.nextLine();

        System.out.println("Enter your country name");
        String countryName = scan.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("stateName = " + stateName);
        System.out.println("countryName = " + countryName);
        System.out.println("zipCode = " + zipCode);
        scan.close();
    }
}
/*
1.Enter  your full name
2.Enter building number
3.Enter your Street name
4.Enter your city name
5. Enter your state
6.Enter your zip code
 */