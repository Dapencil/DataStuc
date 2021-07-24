package list_im_arr;

import adt.List;

public class ArrayList<T> implements List<T> {
    private T[] arr;
    private int size,capacity;

    public ArrayList(){
        this(1);
    }
    public ArrayList(int i){
        arr = (T[]) new Object[i];
        size = i-1;
        capacity = i-1;
    }

    @Override
    public void add(T elem) {

    }

    @Override
    public void remove(T elem) {

    }

    @Override
    public boolean contains(T elem) {
        for(T inner : arr ){
            if(elem.equals(inner)) return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int i, T elem) {

    }

    @Override
    public void remove(int i) {

    }

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public void set(int i, T elem) {

    }
}
