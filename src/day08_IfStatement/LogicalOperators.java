package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "aaron";
        int age = 18;
        String citizen = "USA";
        boolean isEligible = age >= 18 &&  citizen == "USA";
       //                         18 >=18 && "USA" == "USA"
        //                        true    && true ==> true
        System.out.println(name + " is eligible to vote :  " +isEligible);


        System.out.println("----------------");

        String name3 = "Shay";
        int age3=
                 21;
        char gender = 'F';

        boolean isEligibl3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        System.out.println(name3 + " is eligible to register "+ isEligibl3);
        System.out.println("------------------------------------------");

        boolean result= true;
        boolean result1 = ! result;
        System.out.println("result = " + result);
        System.out.println("result1 = " + result1);
        System.out.println("------------------------------------------");


        int score = 55;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);




    }
}
