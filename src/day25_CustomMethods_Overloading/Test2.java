package day25_CustomMethods_Overloading;

import Utilities.ArrayUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        ArrayUtility.printEachElement(arr1);

        System.out.println("----------------");
        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        ArrayUtility.printEachElement(arr2);
        System.out.println("----------------");
        char[] arr3 = {'A', 'B', 'C', 'D'};
        ArrayUtility.printEachElement(arr3);
        System.out.println("----------------------");
        String[] names = {"David", "Elvira", "Ali", "Igor"};
        ArrayUtility.printEachElement(names);
        System.out.println("--------------------------");

        int[] n1 = {10, 2, 3, 4, 5};
        int max1 = ArrayUtility.max(n1);
        System.out.println("max1 = " + max1);

        System.out.println("-------------------");

        double[] n2 = {2.3, 4.5, 6.6, 7.8, 20.5};
        double max2 = ArrayUtility.max(n2);
        System.out.println("max2 = " + max2);
        System.out.println("-----------------------------");
        int[] n3 = {3, 5, 8, 1, 9, 36, 22, -15};
        int min = ArrayUtility.min(n3);
        System.out.println("min = " + min);
        System.out.println("------------------------");
        int[] a1 = {1, 2, 3, 4, 5, 6, 7};
        boolean r1 = ArrayUtility.contains(a1, 5);
        System.out.println("r1 = " + r1);

        System.out.println("-------------------------");


    }
}
