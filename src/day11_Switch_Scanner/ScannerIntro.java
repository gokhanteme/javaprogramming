package day11_Switch_Scanner;
import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {

        System.out.println("Enter an Integer");
        Scanner input =  new Scanner(System.in);
        int n1 = input.nextInt();
        System.out.println("Enter a decimal");
        double num2 = input.nextDouble();

        System.out.println(n1);
        System.out.println(num2);
        System.out.println("Multipication : " + (n1*num2));
        input.close();//closes the scanner

    }

}
