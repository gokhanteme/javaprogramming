package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabet = new char[26];// Z~~Ã

        alphabet[0]= 'Z';
alphabet[1] = 'Y';

char ch = 'Z';
        for (int i = 0; i < alphabet.length; i++,ch--) {
            alphabet[i] = ch;
        }
        System.out.println(Arrays.toString(alphabet));//print the whole array
        System.out.println(alphabet[0]);// printing the element of array

        System.out.println("-----------------------------------");

        char[] alphabet1 = new char[26];

        for (char i = 0, j='Z';i<alphabet1.length; i++,j--){

            alphabet1[i] =j;
        }
        System.out.println(Arrays.toString(alphabet1));
    }
}
