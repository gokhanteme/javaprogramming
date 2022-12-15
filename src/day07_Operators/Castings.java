package day07_Operators;

public class Castings {
    public static void main(String[] args) {


        float averageScore=20.5f;

        System.out.println("averageScore = " + averageScore);
        
        byte num1=(byte)averageScore;// explicit casting
        System.out.println("num1 = " + num1);
        
        short num2=(short)averageScore;//explicit castings
        System.out.println("num2 = " + num2);
                
        int num3=(int)averageScore;//explicit castings
        System.out.println("num3 = " + num3);
        
        long num4=(long)averageScore;//explicit casting
        System.out.println("num4 = " + num4);
        
        float num5=averageScore;//no casting
        System.out.println("num5 = " + num5);
        
        double num6=averageScore;//implicit csting
        System.out.println("num6 = " + num6);

        System.out.println(num1+num2+num3+num4+num5+num6);
        System.out.println(num1+ num2+ num3 +num4+num5+num6);
    }



}
/*
1. create a class named Castings
1.1 declare a variable of float named averageScore and
initialize it to 20.5
1.2 declare the following variables and assign averageScore to
each of them:
byte num1;
short num2;
int num3;
long num4;
float num5
double num6;

implicit casting:castings smaller type to larger
explicit casting:castings the larger to smaller
 */