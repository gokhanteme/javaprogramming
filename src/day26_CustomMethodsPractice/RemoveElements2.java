package day26_CustomMethodsPractice;

import Utilities.ArrayUtility;

import java.util.Arrays;

public class RemoveElements2 {
    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500, 600};
        numbers = removeElement(numbers, 1);
        numbers = removeElement(numbers, 1);

        System.out.println(Arrays.toString(numbers));


    }


    // removes the index of the array, return new array
    public static int[] removeElement(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index");
            System.exit(0);
        }
        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArrayUtility.addElement(result, array[i]);
            }

        }
        return result;
    }
}
