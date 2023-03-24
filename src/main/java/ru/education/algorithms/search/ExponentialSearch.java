package ru.education.algorithms.search;

import java.util.Objects;



/**
 * Экспоненциальный поиск log(n)
 *
 * Сначала берём второй элемент в массиве и проверяем его, дажее увеличиваем индекс опорного элемента в 2 раза,
 * если число оказалось внутри диапазона, запускаем бинарный поиск
 *
 * */

public class ExponentialSearch {

    public static int search(Integer[] arr, Integer num2Find) {
        if (Objects.equals(arr[0], num2Find)) {
            return 0;
        }
        if (Objects.equals(arr[arr.length - 1], num2Find)) {
            return arr.length - 1;
        }

        int base = 1;
        int i = 0;

        while (base < arr.length && arr[base] <= num2Find) {
            i++;
            if (Objects.equals(arr[base], num2Find)) {
                return base;
            }

            base *= 2;
        }

        return BinarySearchVariant2.search(arr, num2Find, base / 2 - 1, Math.min(base - 1, arr.length - 1));


    }

}
