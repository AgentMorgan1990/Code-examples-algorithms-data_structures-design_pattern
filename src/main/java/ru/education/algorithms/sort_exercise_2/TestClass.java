package ru.education.algorithms.sort_exercise_2;

/**
 * Дан массив из n элементов, начиная с 1. Каждый следующий элемент равен (предыдущий + 1).
 * Но в массиве гарантированно 1 число пропущено. Необходимо вывести на экран пропущенное число.
 *
 * Примеры:
 * [1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16] => 11
 * [1, 2, 4, 5, 6] => 3
 * [1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21] => 20
 * [1, 2, 3, 4, 5, 6] => 7
 * [] => 1
 * [1] => 2
*/

public class TestClass {
    public static void main(String[] args) {

        int[] array1 = new int[]{1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};
        System.out.println(SearchAlgorithm.search(array1));

        int[] array2 = new int[]{1, 2, 4, 5, 6};
        System.out.println(SearchAlgorithm.search(array2));

        int[] array3 = new int[]{1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21};
        System.out.println(SearchAlgorithm.search(array3));

        int[] array4 = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(SearchAlgorithm.search(array4));

        int[] array5 = new int[]{};
        System.out.println(SearchAlgorithm.search(array5));

        int[] array6 = new int[]{1};
        System.out.println(SearchAlgorithm.search(array6));

        int[] array7 = new int[]{1,2};
        System.out.println(SearchAlgorithm.search(array7));

    }
}