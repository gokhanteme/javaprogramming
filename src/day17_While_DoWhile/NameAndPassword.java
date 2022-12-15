package day17_While_DoWhile;

import java.util.Scanner;

public class NameAndPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your name:");
            String name = scan.next();

            System.out.println("Enter your password:");
            String password = scan.next();
            if (name.equals("Cydeo")&& password.equals("Cydeo123")){
                break;

            }
            if (i ==3){
                System.out.println("Not valid name and password");
                break;

            }


        }

    }
}
