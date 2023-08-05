package ru.examples.algorithms.recursion;

public class Countdown {

    public static void main(String[] args) {
        countdown(10);
    }

    private static void countdown(int i) {

        if (i < 1) {
            return;
        }

        System.out.println(i);
        countdown(i - 1);
        System.out.println("End i = " + i); //хвостовая рекурсия, начинает выполнятся после вызова всех рекурсивных методов в обратном порядке
    }
}
