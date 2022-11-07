package ru.education.algorithms.sort_exercise_2;

public class SearchAlgorithm {
    public static int search(int[] array) {

        int findNumber = -1;
        int startPosition = 0;
        int endPosition = array.length - 1;
        int middle;

        //частный случаи
        if (array.length == 0) {
            return 1;
        }

        //частный случаи
        if (array.length == 1) {
            return 2;
        }

        //частный случаи
        if (array[array.length - 1] == array.length) {
            return array[array.length - 1] + 1;
        }

        while (array[startPosition] + 1 == array[startPosition + 1]) {

            middle = (array[endPosition] - array[startPosition]) / 2 + startPosition;

            if ((middle + 1) == array[middle]) {
                startPosition = middle;

            } else {
                endPosition = middle;
            }
            findNumber = startPosition;
        }

        return findNumber + 2;
    }
}

