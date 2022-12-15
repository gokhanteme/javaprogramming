package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {
        int[] numbers = {10, 500, 300, 40, 600, 80, 90};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {//if there is element in the array that's greater than the current min  number
            if (numbers[i]<min){
               min= numbers[i];// assigning smaller number to variable min
            }
        }
        System.out.println(min);
    }
}
