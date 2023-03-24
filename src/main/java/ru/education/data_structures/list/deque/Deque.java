package ru.education.data_structures.list.deque;

import ru.education.data_structures.queue.Queue;

public interface Deque <E> extends Queue<E> {

    boolean insertLeft(E value);
    boolean insertRight(E value);

    E removeLeft();
    E removeRight();
}
