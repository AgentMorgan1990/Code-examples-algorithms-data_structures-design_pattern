package ru.examples.algorithms.search;

public class BinarySearchVariant2 {


    public static int search(Integer[] arr, int num2Find) {
        return search(arr, num2Find, 0, arr.length - 1);
    }


    public static int search(Integer[] arr, int findingElement, int start, int end) {
//        int start = 0;
//        int end = arr.length - 1;
        int base = arr.length / 2;


        while (true) {

            System.out.println("Start " + start);
            System.out.println("End " + end);
            System.out.println("Base " + base);

            if (arr[base] == findingElement) {
                return base;
            }

            System.out.println("Base number " + arr[base]);
            if (arr[base] > findingElement) {
                end = base - 1;
            } else {
                start = base + 1;
            }

            base = (start + end) / 2;

            if (start > end) {
                return -1;
            }

        }
    }
}
