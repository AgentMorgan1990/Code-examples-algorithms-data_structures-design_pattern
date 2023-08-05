package ru.examples.algorithms.sort.low_speed;

public class SelectionSort2 {

    /**
     * Ещё один вариант реализации сортировки выбором, кажется более оптимальый
     */

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }
}
