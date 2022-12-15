package day08_IfStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {
    int number=100;


    boolean divisibleBy2= number % 2 == 0; // if The remainder of a number divided by 2 is zero, then it's evenly divisible by 2.
    boolean divisibleBy3 = number % 3 == 0;
    boolean divisibleBy5 = number % 5 == 0;


        System.out.println("divisibleBy2 = " + divisibleBy2);
        System.out.println("divisibleBy3 = " + divisibleBy3);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("-----------------------------");
        int n=60;
        if (n%2==0){
            System.out.println("True");
        }else {
            System.out.println("false");
        }
        if (n%3==0){
            System.out.println("True");
        }else {
            System.out.println("false");
        }
        if (n%5==0){
            System.out.println("True");
        }else {
            System.out.println("falce");
            System.out.println("-----------------------------");

            int year= 2000;
            boolean isLeapYear = year % 4==0;
            System.out.println("isLeapYear = " + isLeapYear);
        }
    }
}


/*
Create a class called EvenlyDivisible,and write a program that can
check if a number is evenly divisible by 2, 3, 5
Ex:
number = 65;
output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true
 */