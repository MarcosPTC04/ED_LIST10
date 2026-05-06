package dev.marcos.datastructures.list;

public interface MyList<T> {

    void addFirst(T value);

    void addLast(T value);

    void insertAt(int index, T value);

    void addSorted(T value);

    T removeFirst();

    T removeLast();

    T removeAt(int index);

    boolean remove(T value);

    void clear();

    int find(T value);

    T get(int index);

    void set(int index, T value);

    int size();
}
