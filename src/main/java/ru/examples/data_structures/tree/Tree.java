package ru.examples.data_structures.tree;

public interface Tree<E extends Comparable<? super E>> {
    enum TraversMode {
        IN_ORDER, PRE_ORDER, POST_ORDER
    }

    boolean contains(E value);

    boolean add(E element);

    boolean remove(E value);

    boolean isEmpty();

    int size();

    void display();

    void traverse(TraversMode mode);
}
