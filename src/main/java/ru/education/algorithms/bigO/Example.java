package ru.education.algorithms.bigO;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Example {




    /**
     * Определить сложность следующих алгоритмов:
     * -. Поиск элемента массива с известным индексом                   - O(1)
     * -. Дублирование одномерного массива через foreach                - O(n)
     * -. Удаление элемента массива с известным индексом без сдвига     - O(1)
     * -. Удаление элемента массива с неизвестным индексом без сдвига   - O(n), если массив не отсортирован, если отсортирован O(log n)
     * -. Удаление элемента массива с неизвестным индексом со сдвига    - O(n)
     * */

    public static void main(String[] args) {
        example1();
        example2();
        example3();
        factorial(BigInteger.valueOf(10000));
//        fib(BigInteger.valueOf(50));
    }

    /**
     * O(n) * O(log n) = O(n log)
     */
    private static void example1() {

        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j *= 2) {
                arrayList.add(i * j);
            }
        }
        System.out.println(arrayList.size());
    }

    /**
     * O(n) * O(n) = O(n^2)
     */
    private static void example2() {

        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i += 2) {
            for (int j = i; j < n; j++) {
                arrayList.add(i * j);
            }
        }
        System.out.println(arrayList.size());
    }


    /**
     * O(n)
     */
    private static void example3() {

        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrayList.add(i * j);
                n--;
            }
        }
        System.out.println(arrayList.size());
    }


    /**
     * O(n) * O(n) из-за сложной арифметики = O(n^2)
     */
    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return n;
        }
        return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
    }


    /**
     * O(1.6^n) * O(n) из-за сложной арифметики  => O(2^n)
     */
    public static BigInteger fib(BigInteger n) {
        if (n.equals(BigInteger.ONE) || n.equals(BigInteger.TWO)) {
            return n;
        }
        return fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.TWO)));


    }
}
