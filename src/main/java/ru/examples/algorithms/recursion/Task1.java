package ru.examples.algorithms.recursion;


public class Task1 {

    public static void main(String[] args) {

        ValuableItem[] items = {
                new ValuableItem(1, 89),
                new ValuableItem(2, 67),
                new ValuableItem(3, 3),
                new ValuableItem(4, 4),
                new ValuableItem(5, 300),
                new ValuableItem(11, 980),
                new ValuableItem(2, 800)
        };

        int[] weight = {1, 2, 3, 4, 5};
        int[] value = {1, 2, 15, 4, 5};

        System.out.println(knapsackRec(weight, value, weight.length, 8));
        System.out.println(knapsackRecObj(items, items.length, 8));

    }


    public static int knapsackRec(int[] w, int[] v, int n, int W) {
        if (n <= 0) {
            return 0;
        } else if (w[n - 1] > W) {
            return knapsackRec(w, v, n - 1, W);
        } else {
            return Math.max(knapsackRec(w, v, n - 1, W), v[n - 1]
                    + knapsackRec(w, v, n - 1, W - w[n - 1]));
        }
    }

    public static int knapsackRecObj(ValuableItem[] items, int n, int W) {
        if (n <= 0) {
            return 0;
        } else if (items[n - 1].getWeight() > W) {
            return knapsackRecObj(items, n - 1, W);
        } else {
            return Math.max(
                    knapsackRecObj(items, n - 1, W),
                    items[n - 1].getValue() + knapsackRecObj(items, n - 1, W - items[n - 1].getWeight())
            );
        }
    }

}


class ValuableItem {
    private int weight;
    private int value;

    public ValuableItem(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }
}

