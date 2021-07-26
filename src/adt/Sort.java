package adt;

public interface Sort<T extends Comparable> {
   void add(T element);
   void remove(T element);
   boolean contains(T element);
   T get(int index);
   boolean isEmpty();
   int size();
}
