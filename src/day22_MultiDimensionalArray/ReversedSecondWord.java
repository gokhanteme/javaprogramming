package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReversedSecondWord {
    public static void main(String[] args) {
        String sentence = "I Love Java";
        String[] words = sentence.split(" ");// [ I, Love, Java]

        String reverse = "";
        for (int i = words[1].length()-1; i >=0 ; i--) {
            reverse +=words[1].charAt(i);
        }
        System.out.println(reverse);
      //  sentence = sentence.replaceFirst(words[1],reverse);
       // System.out.println(sentence);
        words[1]=reverse;
        System.out.println(Arrays.toString(words));
String result = "";
        for (String word : words) {
            result += word + " ";
        }
        System.out.println(result);
    }
}
