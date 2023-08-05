package ru.examples.data_structures.stack;

public class StackImpl <E> implements Stack{

    private final Object[] data;
    private int size;

    public StackImpl(int maxSize) {
        this.data = new Object[maxSize];
    }

    @Override
    public boolean push(Object value) {
        if (isFull()) {
            return false;
        }
        data[size++] = value;
        return true;
    }

    @Override
    public E pop() {
        E value = peek();
        data[--size] = null;
        return value;
    }

    @Override
    public E peek() {
        return (E) data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return data.length == size;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");
        for (int i = size-1; i >=0 ; i--) {
            sb.append(data[i]);
            if (i>0){
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }
}
