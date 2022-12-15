package day25_CustomMethods_Overloading;

public class MethodOverloading {

    public static void main(String[] args) {

        int sum1 = sumOfNumbers(10,20);

        double sum2 = sumOfNumbers(1.5, 2.5);

        int sum3 = sumOfNumbers(10,20,30);
        double sum4 = sumOfNumbers(1.5, 2.5, 3.5);

        int sum5 = sumOfNumbers(10,20,30,40);

        double sum6 = sumOfNumbers(1.5, 2.5, 3.5, 4.5);

    }


    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static double sumOfNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3) {
        return sumOfNumbers(num1, num2) + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return sumOfNumbers(num1, num2, num3) + num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4) {
        return sumOfNumbers(num1, num2, num3) + num4;

    }
}