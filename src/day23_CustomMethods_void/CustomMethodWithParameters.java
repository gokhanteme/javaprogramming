package day23_CustomMethods_void;

public class CustomMethodWithParameters {
    public static void main(String[] args) {
        // oddOrEven();//method demands additional information
        oddOrEven(10);

        ageOfPerson(1981);

        printNumbers(1000,2000);
    }

    //create a function that can check if a number is  ood number or even number

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is a even number");

        } else {
            System.out.println(number + " is a od number");


        }
    }

    // create a function that ca display the age of the person

    public static void ageOfPerson(int birthYear) {

        int age = 2022 - birthYear;
        System.out.println("your age is: " + age);
    }

// create a function that print all numbers between X and Y

    public static void printNumbers(int x, int y){

    }
}