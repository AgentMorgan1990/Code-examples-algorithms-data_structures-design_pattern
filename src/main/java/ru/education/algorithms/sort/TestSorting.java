package ru.education.algorithms.sort;

import ru.education.algorithms.RecursionFunction;

import java.util.Arrays;

public class TestSorting {



    public static void main(String[] args) {

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
