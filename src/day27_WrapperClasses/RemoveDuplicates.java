package day27_WrapperClasses;

import Utilities.ArrayUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,3,3,3,3,4,4,4,4};
        arr =removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------------");
        String[] arr2 = {"Java", "Java", "Python", "C#", "Java","Java"};
        arr2 =removeDuplicates(arr2);

        System.out.println(Arrays.toString(arr2));
        System.out.println("--------------------------------");
        int[] numbers = {1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,5,5,5};
        numbers =Arrays.stream(numbers).distinct().toArray();
        System.out.println(Arrays.toString(numbers));

    }





//    removes the duplicates from the given array, returns the new array                                  
    public static int[] removeDuplicates(int[] array){

int[] result = {};
        for (int each : array) {
            if (!ArrayUtility.contains(result,each)){
                result = ArrayUtility.addElement(result, each);
            }
        }

return result;


    }


    //    removes the duplicates from the given array, returns the new array                                  
    public static double[] removeDuplicates(double[] array){

       double[] result = {};
        for (double each : array) {
            if (!ArrayUtility.contains(result,each)){
                result = ArrayUtility.addElement(result, each);
            }
        }

        return result;


    }


    //    removes the duplicates from the given array, returns the new array                                  
    public static char[] removeDuplicates(char[] array){

       char[] result = {};
        for (char each : array) {
            if (!ArrayUtility.contains(result,each)){
                result = ArrayUtility.addElement(result, each);
            }
        }

        return result;


    }

    //    removes the duplicates from the given array, returns the new array                                  
    public static String[] removeDuplicates(String[] array){

        String[] result = {};
        for (String each : array) {
            if (!ArrayUtility.contains(result,each)){
                result = ArrayUtility.addElement(result, each);
            }
        }

        return result;


    }


}
