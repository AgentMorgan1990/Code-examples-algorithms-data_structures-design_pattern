package ru.examples.algorithms.sort.low_speed;

import java.util.Arrays;

public class SelectionSortWithMinAndMax {

    /**
     * Ещё один вариант реализации сортировки выбором, кажется более оптимальый
     */

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int min = i;
            int max = arr.length - i - 1;

            System.out.println("Индекс минимума до цикла " + min + " Значение минимума " + arr[min]);
            System.out.println("Индекс максиума до цикла " + max + " Значение максиума " + arr[max]);

            for (int j = min + 1; j < arr.length - i; j++) {

                if (arr[min] > arr[max]) {
                    min = arr.length - i - 1;
                    max = i;

                    int tmp = arr[min];
                    arr[min] = arr[max];
                    arr[max] = tmp;

                }

                if (arr[j] < arr[min]) {
                    min = j;
                }

                if (arr[j] > arr[max]) {
                    max = j;
                }
            }

            System.out.println("Индекс минимума после цикла " + min + " Значение минимума " + arr[min]);
            System.out.println("Индекс максиума после цикла " + max + " Значение максиума " + arr[max]);

            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;

            int tmp1 = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[max];
            arr[max] = tmp1;

            System.out.println(Arrays.toString(arr));
        }
    }
}
