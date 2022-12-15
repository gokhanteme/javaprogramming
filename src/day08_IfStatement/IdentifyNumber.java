package day08_IfStatement;

public class IdentifyNumber {


    public static void main(String[] args) {


        int number=200;
        boolean İsPositive=number  > 0;
        boolean İsNegativeNumber=number < 0;
        boolean İsZero= number== 0;

        System.out.println(number +" is Positive Number: "+ İsPositive);
        System.out.println(number+ " is negative number " + İsNegativeNumber);
        System.out.println(number+ " is zero " + İsZero);

    }

}
/*
1. Create a class called IdentifyNumber, and write a program that
can identify if the given number is positive, or negative or zero.
Ex:
number = 200
output:
        200 is positive number: true
        200 is negative number: false
        200 is zero: false
 */