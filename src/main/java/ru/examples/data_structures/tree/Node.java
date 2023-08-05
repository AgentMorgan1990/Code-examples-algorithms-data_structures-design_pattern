package ru.examples.data_structures.tree;

public class Node<T extends Comparable<? super T>> {

    private T value;

    private Node<T> leftChild;
    private Node<T> rightChild;

    private int repeat;
    private boolean isRed;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isLeftChild(T value) {
        return getValue().compareTo(value)>0;
    }

    public boolean isLeaf() {
        return leftChild == null && rightChild == null;
    }

    public boolean hasOnlyOneChild() {
//          return (leftChild == null && rightChild != null) || (leftChild != null && rightChild == null);
//          пример применения исключающего оператора XOR значит тоже самое, что и в зкомметированной строке
        return leftChild != null ^ rightChild != null;
    }
}
