package day07_Operators;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class ShortHandOperators {
    public static void main(String[] args) {


        int a = 15;
        ++a;//pre-increment


        System.out.println(a);
        --a;//pre-decrement
        System.out.println(a);

        System.out.println("--------------------------");
        System.out.println(a++);
        System.out.println(a);
        System.out.println("----------------");
        int b = 50;
        System.out.println(b);
        System.out.println(b++);
        System.out.println(b--);
        System.out.println(b--);
        System.out.println(b);
        System.out.println(b);

        System.out.println("----------------");

        int c = 90;
        c--;//post-decrement.
        System.out.println(c);
        System.out.println(c--);
        System.out.println(c);
        System.out.println("----------------");
        int d = 60;
        d++;//post increment
        System.out.println(d);
        System.out.println(d++);
        System.out.println(d);

        int ivar = 100;
        double dvar = 123;
        float fvar = 200;
        int resulta = 10;
        int resultb = 20;
        System.out.println("Resulta" + 0 + 1);
        System.out.println("resultb" + 1 + 2);


        System.out.println("5+2=" + 3 + 4);
        System.out.println("5+2=" + (3 + 4));

        System.out.println("--------------------");


        int number=100;
        System.out.println("number = " + number);
        number=200;
        System.out.println("number = " + number);

        System.out.println("--------------------");
        String word="JavaProgramming";
        System.out.println("word = " + word);
        System.out.println("--------------------");
        word="wooden spoon";
        System.out.println("word = " + word);
        System.out.println("--------------------");
        word="Cydeo";
        System.out.println("word = " + word);
        System.out.println("--------------------");
        word="JavaPrograming";
        System.out.println("word = " + word);

        System.out.println("--------------------");

        //Addition assigment:
        int x=100;
        System.out.println(x+100);
        System.out.println("x = " + x);

        //x=x+200;
        x+=200;
        System.out.println("x = " + x);
        String str="Spoon";
        str+="Wooden";
        System.out.println("str = " + str);

        double num1=2.5;
        num1+=5.5;
        System.out.println("num1 = " + num1);

        double avaibleBalance=1000.50;
        avaibleBalance +=300;
        System.out.println("avaibleBalance = " + avaibleBalance);
        System.out.println("--------------------");
        //subraction Assigment.
        // withdrawing 500$.
        avaibleBalance -=500;
        System.out.println("avaibleBalance = " + avaibleBalance);

        avaibleBalance -=200;
        System.out.println("avaibleBalance = " + avaibleBalance);
        avaibleBalance -=400;
        System.out.println("avaibleBalance = " + avaibleBalance);

        System.out.println("--------------------");
        
        //multiplication assigment.
        
        double salary=5000.50;
        System.out.println("salary = " + salary);
        salary *=2;
        System.out.println("salary = " + salary);

        double dodge=0.000001;
        System.out.println("dodge = " + dodge);
        dodge *=1000000;
        System.out.println("dodge = " + dodge);
        System.out.println("--------------------");
        //Division Assigment.

        double num2=25000;
        System.out.println("num2 = " + num2);

        num2 /=2;
        System.out.println("num2 = " + num2);

        System.out.println("--------------------");

        //remainder Assigment.
        double num3=100;
        System.out.println("num3 = " + num3);
        num3 %=3;
        System.out.println("num3 = " + num3);

        System.out.println("--------------------");


        int amount=127;//cents

        int quarters=127 / 25;
        int cents=127%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        System.out.println("--------------------");

        int cents2=127;
        cents2 %=25;
        System.out.println("cents2 = " + cents2);
        System.out.println("--------------------");
        int y=300;
        y %=300;
        System.out.println("y = " + y);
        y %=16;
        System.out.println("y = " + y);




    }
}




