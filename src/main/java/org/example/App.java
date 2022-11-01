package org.example;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int[] array = {1,3,5,7,9,11,13,15,17,19,67,78,98,115,116,117,119,120,121,122,134,167,175};
        System.out.println(BinaryAlgorithm.binarySearch(array,175));

        int[] array2 = {45, 89, 78, 90, 500, 456, 34, 23, 1, 67, 4, 34, 56, 7};
        System.out.println(Arrays.toString(array2));
        int[] sortedArray = SelectionSort.selectionSort(array2);
        System.out.println(Arrays.toString(sortedArray));

        int[] array3 = {20, 2, 78, 54, 3, 567, 3, 2, 34, 56};
        System.out.println(RecursionFunction.sumNumbers(array3));
        System.out.println(RecursionFunction.countElements(array3));
        System.out.println(RecursionFunction.maxNumber(array3));
        System.out.println(Arrays.toString(QuickSort.quickSort(array3)));
    }
}
