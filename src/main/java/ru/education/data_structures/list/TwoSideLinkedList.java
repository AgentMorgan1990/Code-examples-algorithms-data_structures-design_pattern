package ru.education.data_structures.list;

public interface TwoSideLinkedList<E> {

    void insertLast(E value);

    E getLast();

    public E removeFirst();
}
