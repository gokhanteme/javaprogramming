package day17_While_DoWhile;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your username");
        String userName = scan.next();

        System.out.println("Please enter your password");
        String password = scan.next();

        if (userName.equals("Cydeo")|| password.equals("Cydeo123")){
            System.out.println("Logged in");

        }else {
            int attemtps = 3;
            while (!(userName.equals("Cydeo")|| password.equals("Cydeo123"))&&attemtps>0){
                if (attemtps ==1){
                    System.out.println("THIS IS YOURS LAST CHANCE");
                }
                System.out.println("Invalid username or password, please re-enter");
                System.out.println("Please enter your username");
                userName = scan.next();
                System.out.println("Please enter your password");
                 password = scan.next();
                 attemtps --;
            }
            if (userName.equals("Cydeo")|| password.equals("Cydeo123")){
                System.out.println("Logged in");
        }else {
                System.out.println("Your account locked");}
            scan.close();
        }
    }
}
