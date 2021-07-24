package adt;

public interface List<T> extends Collection<T>{
    void add(int i,T elem);
    void remove(int i);
    T get(int i);
    void set(int i,T elem);
}
