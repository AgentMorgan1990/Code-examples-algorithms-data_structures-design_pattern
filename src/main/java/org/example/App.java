package org.example;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int[] array = {45, 89, 78, 90, 500, 456, 34, 23, 1, 67, 4, 34, 56, 7};
        System.out.println(Arrays.toString(array));
        int[] sortedArray = SelectionSort.selectionSort(array);
        System.out.println(Arrays.toString(sortedArray));

        System.out.println("Hello World!");
    }
}
