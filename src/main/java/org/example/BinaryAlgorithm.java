package org.example;

public class BinaryAlgorithm {


    public static Integer binarySearch(int[] array, int item) {

        /*
         * item - искомое значение
         * desiredValue - индекс искомого значения
         * low - нижняя граница массива (индекс)
         * high - верхняя граница массива (индекс)
         * mid - середина массива (индекс)
         * guess - значение под mid индексом массива
         * */

        int low = 0;
        int high = array.length - 1;
        Integer desiredValue = null;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == item) {
                desiredValue = mid;
                break;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return desiredValue;
    }
}
