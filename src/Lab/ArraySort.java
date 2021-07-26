package Lab;

import adt.Sort;

public class ArraySort<T extends Comparable> implements Sort<T> {
    T[] arr;
    int size,capacity;

    public ArraySort() {
        this(16);
    }
    public ArraySort(int capacity) {
        arr = (T[]) new Comparable[capacity];
        size = 0;
        this.capacity = capacity;
    }
    @Override
    public void add(T element) {
        int index = 0;
//        if(isEmpty())
//        {
//            arr[size] = element;
//            size++;
//            return;
//        }
        if(size+1>=capacity){
            capacity *= 2;
            T[] tempArray = (T[]) new Comparable[capacity];
            for(int j = 0;j<size;j++){
                tempArray[j] = arr[j];
            }
            arr = tempArray;
        }
        while(true) {
                if (element.compareTo(arr[index]) > 0 && index >size) {
                    arr[index] = element;
                } else if (element.compareTo(arr[index]) <= 0) {
                    T[] tempArray = arr.clone();
                    arr[index] = element;
                    for(int i = index+1;i<size+1;i++){
                            arr[i] = tempArray[i-1];
                    }
                    break;
                }
                index++;
            }
        size++;
    }

    @Override
    public void remove(T element) {
        int temp = size;
        if(!contains(element)) return;
        for(int i =0;i<size;i++){
            if(element.equals(arr[i])){
                temp = i;
            }
            if(i >= temp){
                arr[i] = arr[i+1];
            }
        }size--;
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
        return size()==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        return arr[index];
    }

    public T findElem(T elem){
        for(int i = 0;i<size;i++){
            if(elem.equals(arr[i])){
                return arr[i];
            }
        }
        return null;
    }
    public  void printArray(){
        System.out.println("===========Array==========");
        for (int i = 0 ; i<size ;i++){
            System.out.println(get(i).toString());
        }
    }
}

//        while(true) {
//                if (element.compareTo(arr[index]) > 0 && index >size) {
//                arr[index] = element;
//                } else if (element.compareTo(arr[index]) <= 0) {
//                T[] tempArray = arr.clone();
//                arr[index] = element;
//                for(int i = index+1;i<size+1;i++){
//        arr[i] = tempArray[i-1];
//        }
//        break;
//        }
//        index++;
//        }
