package day09_IfStatement;

public class PosnegZero {
    public static void main(String[] args) {

        int num = 0;
        boolean numPos= num>0;
        boolean numNeg = num < 0;
        boolean numZero = !numNeg && !numPos;

        if (numPos){
            System.out.println("the number is positive");
        } else if (numNeg) {
            System.out.println("the number is negative");

        } else  {
            System.out.println("the number is zero");

        }


    }
}
