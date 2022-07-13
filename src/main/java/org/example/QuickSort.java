package org.example;

import java.util.Arrays;


/*
* Быстрая сортировка
* Скорость алгоритма - O(n log n)
* Выбираем случайный опорный элемент
* Делим массив на два списка - элементы первого меньше опорного элемента, элементы второго - больше
* Далее для каждого полученного массива повторяем алгоритм и склеиваем получающиеся массивы
*
* */
public class QuickSort {

    public static int[] quickSort(int[] array) {
        if (array.length < 2) {
            return array;
        } else {
            //Опорный элемент
            int pivot = array[0];
            //Массив с элементами меньше опорного
            int[] less = new int[0];
            //Массив с элементами больше опорного
            int[] greater = new int[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] <= pivot) {
                    less = addNumber(less, array[i]);
                } else {
                    greater = addNumber(greater, array[i]);
                }
            }
            return mergeArrays(quickSort(less), pivot, quickSort(greater));
        }
    }

    private static int[] addNumber(int[] array, int number) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = number;
        return newArray;
    }

    private static int[] mergeArrays(int[] firstArray, int pivot, int[] secondArray) {

        int[] newArray = new int[firstArray.length + secondArray.length + 1];

        for (int i = 0; i < firstArray.length; i++) {
            newArray[i] = firstArray[i];
        }

        newArray[firstArray.length] = pivot;

        for (int i = 0; i < secondArray.length; i++) {
            newArray[firstArray.length + i + 1] = secondArray[i];
        }
        return newArray;
    }
}
