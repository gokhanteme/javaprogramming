package day20_Arrays;

import java.util.Arrays;

public class ArrayOfNumbers {
    public static void main(String[] args) {

        int[] numbers = new int[101];

        int oneToHundred = numbers[1];
        for (int i = 0; i < numbers.length; i++, oneToHundred++) {
            numbers[i] = oneToHundred;

            System.out.println(oneToHundred + "");
        }
        System.out.println("----------------------------");

        int[] hundredToOne = new int[numbers.length];
int i=0;
        for (int number : numbers) {
            hundredToOne[i] = number;
            i++;
        }
int[] maxToMinNumber = new int[hundredToOne.length];

        for (int l = hundredToOne.length-1, k= 0; l >=0 ; l--,k++) {
            maxToMinNumber[k] =hundredToOne[l];
        }

        System.out.println(Arrays.toString(maxToMinNumber));

/*

        for (int i = number1.length-1,j=0; i >0; i--) {
hundredToOne= number1[i];
            hundredToOne--;
 */


        // for (int i = numbers.length-1  ; i >= 0; i--) {



    }}



