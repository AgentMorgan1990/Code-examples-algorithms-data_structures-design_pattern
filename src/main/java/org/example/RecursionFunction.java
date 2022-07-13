package org.example;

import java.util.Arrays;


/*
* Примеры рекурсивных функций/методов
*/
public class RecursionFunction {


    public static int sumNumbers(int[] array) {
        if (array.length == 0) {
            return 0;
        } else {
            int[] newArray = Arrays.copyOfRange(array, 1, array.length);
            return array[0] + sumNumbers(newArray);
        }
    }

    public static int countElements(int[] array) {
        if (array.length == 0) {
            return 0;
        } else {
            int[] newArray = Arrays.copyOfRange(array, 1, array.length);
            return 1 + countElements(newArray);
        }
    }

    public static int maxNumber(int[] array) {
        if (array.length == 2) {
            if (array[0] >= array[1]) {
                return array[0];
            } else {
                return array[1];
            }
        } else {
            int sum_max = maxNumber(Arrays.copyOfRange(array, 1, array.length));
            if (array[0] >= sum_max) {
                return array[0];
            } else {
                return sum_max;
            }
        }
    }
}
