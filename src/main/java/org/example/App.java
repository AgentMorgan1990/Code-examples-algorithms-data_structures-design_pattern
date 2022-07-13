package org.example;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int[] array = {20, 2, 78, 54, 3, 567, 3, 2, 34, 56};
        System.out.println(RecursionFunction.sumNumbers(array));
        System.out.println(RecursionFunction.countElements(array));
        System.out.println(RecursionFunction.maxNumber(array));
        System.out.println(Arrays.toString(QuickSort.quickSort(array)));

        System.out.println("Hello World!");
    }
}
