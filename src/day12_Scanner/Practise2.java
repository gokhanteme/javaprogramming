package day12_Scanner;

import java.util.Scanner;

public class Practise2 {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);

        System.out.println("Enter your car speed:");
        int speed = inPut.nextInt();
        String result = "";
        if (speed>= 0 && speed<=250){
            if (speed<=90){
                result ="Your speed is normal";
            } else if (speed>90 &&speed<=140) {
                result = "Your speed is a bit fast,please slow down.";
            } else if (speed>150 && speed<=250) {
                result = "Your speed is very very fast,please urgently slow down.";

            }
        }else {
            System.out.println("Please enter 0~250 numbers");
        }
        System.out.println(result);
        inPut.close();

    }
}
/*
Write a program for the speed check. a variable named speedLimit is
given and assigned, ask user to enter the current speed, if the
current speed is over the speedLimit print slow down, otherwise do not
print anything
Ex:
speedLimit = 55;
Enter current speed:
105
output:
You're driving 50 mph over the limit. Slow down!
 */