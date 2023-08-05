package ru.examples.algorithms.search;


/**
 * Интерполяционный поиск
 *
 * эффективен при высокой плотности элементов
 * В этом поиске находим среднюю плотность массива и умножаем на число, которое хотим найти, это помогает нам
 * переместится сразу в ту часть массива, где находится число
 *
 * */
public class InterpolationSearch {

    public static int search(Integer[] arr, int num2Find) {
        return search(arr, num2Find, 0, arr.length - 1);
    }

    public static int search(Integer[] arr, int findingElement, int start, int end) {
        int base;


        while (end >= start && findingElement >= arr[start] && findingElement <= arr[end]) {

            if (arr[end].equals(arr[start])) {
                break;
            }

            //не забывать приводить к даблу( *1.0 ), т.к. в противном случае всегда будем получать индекс 0
            base = (int) (start + 1.0 * (end - start) / (arr[end] - arr[start]) * (findingElement - arr[start]));

            if (arr[base] == findingElement) {
                return base;
            }

            if (arr[base] > findingElement) {
                end = base - 1;
            } else {
                start = base + 1;
            }
        }

        if (arr[start].equals(findingElement)){
            return start;
        }
        return -1;
    }
}
