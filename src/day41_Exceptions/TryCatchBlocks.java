package day41_Exceptions;

import day39_Recap.cydeoTask.Cydeo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {


        System.out.println("Test1 started");

        try {
            System.out.println("Try Block");
            System.out.println(9/0);
        } catch (ArithmeticException e){
            System.out.println("Catch Block");
            System.out.println("Arithmetic Exceptions was occurred");
        }

        System.out.println("Test1 Completed");

        System.out.println("---------------------------------");

        System.out.println("Tests2 Started");

       int[] numbers =  {1,2,3,4,5};

       try {
           System.out.println("Try block");
           System.out.println(numbers[200]);
       }catch (RuntimeException e){

           System.out.println("Catch Block");

           System.out.println("Runtime Exception was occurred");

           e.printStackTrace();

          // System.out.println(e.getMessage());
       }

        System.out.println("Test2 Completed");

        System.out.println("-------------------------------");

        System.out.println("Tests3 Started");


        try {
            System.out.println("Cydeo".substring(2,0));
        } catch (RuntimeException e) {

            e.printStackTrace();
        }

        System.out.println("Test3 Completed");

        System.out.println("----------------------------------");

        System.out.println("Hello");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Cydeo");

        System.out.println("-----------------------------");

        try {
            FileInputStream file = new FileInputStream("File Path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("World");

    }
}
