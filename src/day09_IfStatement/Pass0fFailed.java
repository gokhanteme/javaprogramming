package day09_IfStatement;

public class Pass0fFailed {
    public static void main(String[] args) {

        int score = 75;
        if (score >= 60) {
            System.out.println("Congrats, you passed");
        } else {
            System.out.println("Failed");
        }

        System.out.println("----------------------------");

        int age = 25;
        boolean buyalcohol= age >=21;
        if (buyalcohol){
            System.out.println("You buy alcohol");
        }else {
            System.out.println("You don't buy alcohol.");
        }


    }

}
