package day17_While_DoWhile;

import java.util.Locale;

public class FrequencyOfWord_whileLoop {
    public static void main(String[] args) {
       String str = "Java Java Python python ";
       int frequecy = 0;

       while (str.contains("Java")){
           str = str.replaceFirst("Java","");
           frequecy ++;
       }
        System.out.println(frequecy);

        System.out.println("----------------------------------");

        String sentence = "cat cat cat cat dog dog dog cat cat CAT CAT CAT";
        sentence =sentence.toLowerCase();
        int count = 0;

        while (sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat","");
            count ++;
        }
        System.out.println(count);

        System.out.println("-----------------------");

        String s = "java java java python python python";
        int countJava = 0;
        int countPython = 0;
        while (s.contains("java") ||s.contains("python")){
            if (s.contains("java")){
                s=s.replaceFirst("java","");
                countJava ++;
            }if (s.contains("python")){
                s=s.replaceFirst("python","");
                countPython ++;
            }

        }System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

    }
}
