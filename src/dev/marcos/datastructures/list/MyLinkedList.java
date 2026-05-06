package dev.marcos.datastructures.list;

public class MyLinkedList<T> implements MyList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {

        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void addFirst(T value) {

    }

    @Override
    public void addLast(T value) {

    }

    @Override
    public void insertAt(int index, T value) {

    }

    @Override
    public void addSorted(T value) {

    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T removeAt(int index) {
        return null;
    }

    @Override
    public boolean remove(T value) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int find(T value) {
        return -1;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void set(int index, T value) {

    }

    @Override
    public int size() {
        return size;
    }
}
