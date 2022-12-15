package day14_String;

import java.util.Scanner;

public class StringMethod4 {
    public static void main(String[] args) {

        String str = "Cydeo";

        String str2 = str.repeat(4); //"CydeoCydeoCydeoCydeo"
        System.out.println((str+" ").repeat(4));
        System.out.println(str2);

        String s1 = "Wooden Spoon "; //Wooden SpoonWooden Spoon
        String s2 = s1.repeat(100);

        System.out.println(s2);

    }

    public static class ReplaceX {
        public static void main(String[] args) {
            String str ="xcodex";
            String result =str.replaceAll("x", "a");
            System.out.println(result);
        }
    }

    public static class StartsWithX {
        public static void main(String[] args) {

            System.out.println("Enter a word");
            String word = new Scanner(System.in).next();//xcodex

                if (word.charAt(0) =='x'){
                    word =word.replaceFirst("x", "a");
                }
            System.out.println(word);

        }
    }
}
