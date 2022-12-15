package day08_IfStatement;

public class ElgibleToVote {
    public static void main(String[] args) {


        String name = "Josh";
        int age = 38;
        String citizen ="USA";

        boolean isToEligible = age >= 21 && citizen == "USA";

        if (isToEligible) //True
        {

            System.out.println("Eligible");
        }

        if (!isToEligible){//!true==> not true ==>false
            System.out.println("NotEligible");
        }

    }
}
