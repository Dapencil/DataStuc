package Lab;

import adt.Sort;

public class ArraySort<T extends Comparable> implements Sort<T> {
    T[] arr;
    int size,capacity;

    public ArraySort() {
        this(16);
    }
    public ArraySort(int capacity) {
        arr = (T[]) new Object[capacity];
        size = 0;
        this.capacity = capacity;
    }
    @Override
    public void add(T element) {
        boolean flag = true;
        if(isEmpty())
        {
            arr[size] = element;
            size++;
            return;
        }
        if(size+1>=capacity){
            capacity *= 2;
            T[] tempArray = (T[]) new  Object[capacity];
            for(int j = 0;j<size;j++){
                tempArray[j] = arr[j];
            }
            arr = tempArray;
        }
        while(flag) {
            for (int i = 0; i < size; i++) {
                if (element.compareTo(arr[i]) > 0) {

                } else if (element.compareTo(arr[i]) <= 0) {

                }
            }
        }

        size++;
    }

    @Override
    public void remove(T element) {
        int temp = size;
        for(int i =0;i<size;i++){
            if(element.equals(arr[i])){
                temp = i;
            }
            if(i >= temp){
                arr[i] = arr[i+1];
            }
        }
    }

    @Override
    public boolean contains(T element) {
        for(T elem : arr){
            if(element.equals(elem)) return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
