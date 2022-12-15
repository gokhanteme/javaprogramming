package day01_JavaIntro;
import Utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
      String str = "Wooden Spoon";

        StringUtility.printEachChar(str);
        System.out.println(str);
        System.out.println("-------------------------");

        String word = "Civic";

        boolean palindrome =StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);
    }

}
