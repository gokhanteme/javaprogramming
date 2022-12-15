package day20_Arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names

        String[] myGroup= new String[5];
        myGroup[0]= "Gunay";
        myGroup[1]= "Neira";
        myGroup[2]= "Suat";
        myGroup[3]= "Hulya";
        myGroup[4]= "Mikael";

        //System.out.println(myGroup); hashcode wrong writing
        System.out.println(Arrays.toString(myGroup));// non primitives is a default value that null
        // primitives is default values that byte,short,int,long is a 0
        // float and double is a 0.0
        // boolean is a false that default value

        System.out.println("----------------------------------------");
String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(day));

        int number = 5;
        if (number< 1 ||number >7){
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(day[number -1]);

        System.out.println("-------------------");

        String[] months = {"January","February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int num = 10;
        if (num<1 || num >12){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(months[num-1]);
    }
}
