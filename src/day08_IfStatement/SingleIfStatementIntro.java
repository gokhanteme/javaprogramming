package day08_IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 101;
        boolean evenNumber= number %2==0;
        boolean oddNumber= ! evenNumber;

        if (evenNumber){
            System.out.println(number + " is even number "+ evenNumber);

        }

        if (oddNumber){
            System.out.println(number + " is odd number "+ oddNumber);

        }
        System.out.println("----------------------------");

        if (evenNumber){
            System.out.println(number + " is even number "+ evenNumber);

    }
        else if (oddNumber){

            System.out.println(number + " is odd number "+ oddNumber);
        }

        }
}
