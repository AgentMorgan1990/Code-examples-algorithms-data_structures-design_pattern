package ru.education.data_structures.list;

public class TwoSideLinkedListImpl<E> extends SimpleLinkedListImpl<E> implements TwoSideLinkedList<E> {


    protected Node<E> last;


    @Override
    public void insertFirst(E value) {
        super.insertFirst(value);
        if (size == 1) {
            last = first;
        }
    }

    @Override
    public void insertLast(E value) {
        if (isEmpty()) {
            insertFirst(value);
            return;
        }
        Node<E> newNode = new Node<>(value, null);
        last.next = newNode;
        last = newNode;
    }

    @Override
    public E removeFirst() {
        E removedValue   = super.removeFirst();

        if(isEmpty()){
            last=null;
        }
        return removedValue;
    }


    @Override
    public boolean remove(E value) {
        Node<E> prev = null;
        Node<E> current = first;

        while (current!=null){
            if (current.item.equals(value)){
                break;
            }
            prev=current;
            current = current.next;
        }

        if (current==null){
            return false;
        }

        if (current==first){
            removeFirst();
            return true;
        }

        if (current==last){
            last=prev;
            last.next = null;
        }

        prev.next=current.next;
        current.next=null;
        size--;

        return true;


    }

    @Override
    public E getLast() {
        return last.item;
    }

    @Override
    public int size(){
        return size;
    }
}
