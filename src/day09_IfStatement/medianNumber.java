package day09_IfStatement;

public class medianNumber {
    public static void main(String[] args) {
        /*
        Create a class called MedianNumber. write a program that can find
the median number between three DIFFERENT given integers
Ex:
a = 10, b= 15, c = 20;
Output:
15 is the median number
Posibility #1: a could be median number
Posibility #2: b could be median number
Posibility #3: c could be median number
         */

        int a = 10,
            b = 15,
            c = 20;

      /*  boolean isMedianNumbera = c>a && a>b && c>b;
        boolean isMedianNumberb = c>b && b>a && c>a;
        boolean isMedianNumberc = a>c && c>b && a>b;
*/

        boolean isMedianNumbera = (a > b && a < c) || ( a > c && a < b);
        boolean isMedianNumberb = (b > c && b< a) || (b>a && b<c);
        boolean isMedianNumberc = !isMedianNumbera && !isMedianNumberb;
        if (isMedianNumbera){
            System.out.println("The a is miedian number");
        }
        if (isMedianNumberb){
            System.out.println( "The b is median number");
        }
        if (isMedianNumberc){
            System.out.println("The c is median number");
        }

    }
}
