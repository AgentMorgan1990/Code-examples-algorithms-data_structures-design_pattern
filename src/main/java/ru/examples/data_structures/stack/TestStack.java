package ru.examples.data_structures.stack;

public class TestStack {

    public static void main(String[] args) {

        testStack();
    }

    private static void testStack() {

       Stack<Integer> stack = new StackImpl<>(4);

        System.out.println("add element: " + stack.push(34));
        System.out.println("add element: " + stack.push(12));
        System.out.println("add element: " + stack.push(20));
        System.out.println("add element: " + stack.push(16));
        System.out.println("add element: " + stack.push(14));
        System.out.println("add element: " + stack.push(17));

        stack.display();
        System.out.println("remove: " + stack.pop());
        System.out.println("remove: " + stack.peek());
//        stack.display();

    }
}
