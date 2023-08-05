package ru.examples.algorithms.sort.low_speed;



/**
 * Сортировка вставками
 *
 * Сложность алгоритма O(n^2)
 * Лучший случай O(n^2)
 * Потребление памяти O(1)
 *
 * Берем первую группу из двух элементов сначала массива и сравниваем, на том ли они месте, если нет, переносим
 * последний элемент на нужное место.
 * Далее берем группу из текущего кол-ва элементов + 1 и сраниваем на том ли месте последний элемент, если нет,
 * меняем его местами
 *
 * */
public class InsertionSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {  // проходим по всему массиву
            int j = i - 1;                      // назначаем индекс нового элемента когорого берем в группу
            int value = arr[i];                 // запоминаем новое значение

            while (j >= 0 && arr[j] > value) {  // в этом цикле проводим проверку и перестановку нового элемента в
                                                // обратном порядке, проверяем, что позиция в массиве не меньше 0 и
                                                // значение больше предыдущего элемента в группе
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = value;
        }
    }
}