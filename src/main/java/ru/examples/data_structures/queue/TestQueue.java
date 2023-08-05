package ru.examples.data_structures.queue;

public class TestQueue {

    public static void main(String[] args) {
        testQueue();
    }

    private static void testQueue() {

        Queue<Integer> queue = new QueueImpl<>(5);

        System.out.println("add element: " + queue.insert(34));
        System.out.println("add element: " + queue.insert(12));
        System.out.println("add element: " + queue.insert(20));
        System.out.println("add element: " + queue.insert(16));
        System.out.println("add element: " + queue.insert(14));
        System.out.println("add element: " + queue.insert(17));

        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();

        System.out.println("add element: " + queue.insert(180));
        queue.display();

    }
}
