package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
          int s = 95;
          String result ="";
        if (s >=0 && s<=100){

            if (s>=90 && s <=100){
                result ="Excellent" ;
            } else if (s>=80 && s <=89){
                result ="Great" ;
            } else if (s>=70 && s <=79){
                System.out.println("Good" );
            } else if (s>=60 && s <=69){
                result ="Passed" ;
            }else {
                result ="Failed" ;
            }
        }else {
            result ="Invalid s";
        }
        System.out.println(result);
        System.out.println("------------------");



       String result1 = (s >=0 && s<=100)?(s>=90 && s <=100)?"Excellent":(s>=80 && s <=89)?"Great":(s>=70 && s <=79)?"Good":(s>=60 && s <=69)?"Passed":"Failed":"Invalid number";
        System.out.println(result);
        System.out.println("-----------------------------");
        String result2 = "";

        if(s >=0 && s<=100){
             result2 =(s>=90 && s <=100)?"Excellent":(s>=80 && s <=89)?"Great":(s>=70 && s <=79)?"Good":(s>=60 && s <=69)?"Passed":"Failed";

        }else {
            result2 ="Invalid s";
        }
        System.out.println(result2);

    }
}
