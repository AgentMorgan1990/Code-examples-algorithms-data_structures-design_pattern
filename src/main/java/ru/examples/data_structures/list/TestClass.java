package ru.examples.data_structures.list;

public class TestClass {

    public static void main(String[] args) {
testLinkedList();
    }


    public static void testLinkedList(){

//        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        TwoSideLinkedListImpl<Integer> linkedList = new TwoSideLinkedListImpl<>();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertFirst(6);
        linkedList.insertFirst(7);
        linkedList.insertFirst(8);
        linkedList.insertLast(12);
        linkedList.insertLast(15);

        linkedList.display();

        System.out.println("Find 2: " + linkedList.contains(2));
        System.out.println("Find 1: " + linkedList.contains(1));
        System.out.println("Find 4: " + linkedList.contains(4));
        System.out.println("Find 4444: " + linkedList.contains(4444));


        System.out.println("Remove first "+ linkedList.removeFirst());
        linkedList.remove(4);
        linkedList.remove(11);
        linkedList.remove(15);

        linkedList.display();

    }


    //todo сделать так, чтобы работало, реализовать итератор
//    private static void testIterator() {
//        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<>();
//
//        for (Integer integer : linkedList) {
//            System.out.println(integer);
//        }
//    }
}
