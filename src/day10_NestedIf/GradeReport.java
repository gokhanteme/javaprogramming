package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        /*
        90~100:excellent
        80~89:Great
        70~79:Good
        60~69:Passed
        0~59:Failed
         */


       /* int score = 95;
        if (score >=0 && score<=100){

            if (score>=90 && score <=100){
                System.out.println("Excellent" );
            } else if (score>=80 && score <=89){
                System.out.println("Great" );
            } else if (score>=70 && score <=79){
                System.out.println("Good" );
            } else if (score>=60 && score <=69){
                System.out.println("Passed" );
            }else {
                System.out.println("Failed" );
            }
        }else {
            System.out.println("Invalid score");
        }

        */

        int score1 =93;
        String result = "";// temporary
        if (score1 >=0 && score1<=100){

            if (score1>=90){
                result="Excellent";
            } else if (score1>=80){
                result ="Great" ;
            } else if (score1>=70){
                result ="Good" ;
            } else if (score1>=60 ){
                result ="Passed" ;
            }else {
                result ="Failed" ;
            }
        }else {
            result ="Invalid score1";
        }
        System.out.println(result);
    }
}
