package adt;

public interface Collection<T> {
    void add(T elem);
    void remove(T elem);
    boolean contains(T elem);
    boolean isEmpty();
    int size();
}
