package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {

      int score = 85;
      boolean a = score>=90&& score<=100;
      boolean b = score >=80&& score<= 89;//boolean b = score >= 80&& !a;boolean
      boolean c = score >= 70&& score<=79;
      boolean d = score >= 60&& score<=69;
      boolean f = score >=0&& score<=59;

      if (a){
          System.out.println("Excellent");

      }
        if (b) {

            System.out.println("Great");
        }
        if (c){
            System.out.println("Good");
        }
        if (d){
            System.out.println("Passed");

        }
        if (f){
            System.out.println("Failed");
        }
    }

}
/*
90~100==>Excellent
80~89==>Grat
70~79==>Good
60~69==>Passed
0~50==>Failed


 */
/*
        System.out.println(true==!false);//true
        System.out.println(!true!=false);//false
        System.out.println(!false==true);//true
        System.out.println(!!false);//true
        /*
 */

