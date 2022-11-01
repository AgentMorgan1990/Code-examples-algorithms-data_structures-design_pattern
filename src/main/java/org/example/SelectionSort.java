package org.example;

import java.util.Arrays;

public class SelectionSort {

    /*
     * Сортировка выбором
     *
     * Сложность алгоритма O(n^2).
     *
     * Выбираем наименьший элемент в массиве.
     * Копируем этот элемент в новый массив.
     * Удаляем наименьший элемент из старого массива.
     * */

    public static int[] selectionSort(int[] array) {
        int[] newArray = new int[array.length];
        int[] oldArray = array;
        for (int i = 0; i < array.length; i++) {
            int smallest = findSmallest(oldArray);
            newArray[i] = oldArray[smallest];
            oldArray = deleteElement(oldArray, smallest);
        }
        return newArray;
    }


    private static int findSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    private static int[] deleteElement(int[] array, int index) {
        int[] result = Arrays.copyOf(array, array.length - 1);
        System.arraycopy(array, index + 1, result, index, array.length - index - 1);
        return result;
    }
}
