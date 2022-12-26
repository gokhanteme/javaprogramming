package day40_FinalKeyword;

public class FinalVariable {

    final  String birthDay;

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }
final static  String name ;

    static {
        name = "EU-10";
    }
    public static void main(String[] args) {

        final double pi=3.14;


        //pi = 4.14; Final variables can not be reassigned
        //pi = 5.4;

        final String name;
        name = "Java";
        //name = "Wooden Spoon";

        System.out.println(name);


        FinalVariable obj = new FinalVariable("14/9/1983");
        System.out.println(obj.birthDay);
        System.out.println(FinalVariable.name);


    }



}
