package ru.education.algorithms.sort;

import ru.education.algorithms.search.BinarySearchVariant2;
import ru.education.algorithms.sort.high_speed.QuickSort_2;
import ru.education.algorithms.sort.low_speed.SelectionSortWithMinAndMax;

import java.util.Arrays;

public class TestSorting {


    public static void main(String[] args) {


        Integer[] array2 = {79, 45, 78, 90, 2, 3, 8, 1, 67, 4, 36, 56, 7, 1, 78, 1, 2, 5, 70};
        System.out.println(Arrays.toString(array2));


        QuickSort_2.sort(array2);
        System.out.println(Arrays.toString(array2));

//        SelectionSortWithMinAndMax.sort(array2);
//        System.out.println(Arrays.toString(array2));
//        System.out.println(BinarySearchVariant2.search(array2,90));
//        SelectionSortWithMinAndMax.sort(array2);
//        SelectionSort2.sort(array2);
//        InsertionSort.sort(array2);
//
//
//        System.out.println(Arrays.toString(array2));

//        BubbleSort.bubbleSort(array2);



//        int[] sortedArray = SelectionSort.selectionSort(array2);
//        System.out.println(Arrays.toString(sortedArray));
//
//        int[] array3 = {20, 2, 78, 54, 3, 567, 3, 2, 34, 56};
//        System.out.println(RecursionFunction.sumNumbers(array3));
//        System.out.println(RecursionFunction.countElements(array3));
//        System.out.println(RecursionFunction.maxNumber(array3));
//        System.out.println(Arrays.toString(QuickSort.quickSort(array3)));
    }
}
