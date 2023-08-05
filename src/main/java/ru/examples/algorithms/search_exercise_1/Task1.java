package ru.examples.algorithms.search_exercise_1;

public class Task1 {


    public static int search(int[] arr) {

        //частный случаи
        if (arr.length == 0) {
            System.out.println("Сработал первый частный случай");
            return 1;
        }

        //частный случаи
        if (arr.length == 1) {
            System.out.println("Сработал второй частный случай");
            return 2;
        }

        int start = 0;
        int end = arr.length - 1;
        int pivot;
        int findNumber = arr[start] + 1;


        while ((arr[start] + 1) == arr[start + 1]) {

            pivot = (start + end) / 2;


            //частный случай
            if ((arr[pivot] - arr[start]) == pivot - start && (arr[end] - arr[pivot]) == end - pivot) {
                System.out.println("Сработал третий частный случай");
                return arr[arr.length - 1] + 1;
            }

            if ((arr[pivot] - arr[start]) == pivot - start) {
                start = pivot;
            } else {
                end = pivot;
            }

            findNumber = arr[start] + 1;
        }
        return findNumber;
    }


    public static void main(String[] args) {

        int[] arr1 = {3, 4, 5, 7, 8, 9, 10, 11, 12};
        int[] arr2 = {1, 3};
        int[] arr3 = {3, 4, 5, 6, 8};
        int[] arr4 = {};
        int[] arr5 = {2, 3, 4};
        int[] arr6 = {1, 2, 3};
        int[] arr7 = {1};
        int[] arr8 = {1,2};

        System.out.println(search(arr1));
        System.out.println(search(arr2));
        System.out.println(search(arr3));
        System.out.println(search(arr4));
        System.out.println(search(arr5));
        System.out.println(search(arr6));
        System.out.println(search(arr7));
        System.out.println(search(arr8));

    }

}
