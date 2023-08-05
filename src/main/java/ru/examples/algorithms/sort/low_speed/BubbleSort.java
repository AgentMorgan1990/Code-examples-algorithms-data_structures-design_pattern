package ru.examples.algorithms.sort.low_speed;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Пузырьковая сортировка
     *
     * Сложность O(n^2)
     * Лучший случай - O(n)
     * Потребление памяти O(1)
     *
     *
     * */
    public static void bubbleSort(int[] arr) {
        boolean isChange;
        int limit = arr.length;


        do {
            isChange = false;
            limit--;
            for (int i = 0; i < limit; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isChange = true;
                }
            }
            System.out.println(limit + " " + Arrays.toString(arr));
        } while (isChange); // если в массиве не происходило перестановок, значит он отсортирован
    }
}
