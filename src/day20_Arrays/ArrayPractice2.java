package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[] letters = new char[26];

     /*   letters[0]= 'A';
        letters[1] = 'B';

      */
       /* for (char i = 'A', j=0; i <='Z' &&j < letters.length; i++,j++) {
            letters[j] = i;

        }

        */

        char ch = 'A';
        for (int i = 0; i < letters.length; i++,ch++) {
            letters[i]= ch;
            // ch++;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("-----------------------------");

        char[] letters2 = new char[26];

        for (char i = 0, j='Z';i<letters2.length; i++,j--){

            letters2[i] =j;
        }
        System.out.println(Arrays.toString(letters2));
    }
}