package Lab;

import adt.List;

public class ArrayList<T> implements List<T> {
    private T[] arr;
    //size refer to
    private int size,capacity;

    public ArrayList(){
        this(16);
    }
    public ArrayList(int i){
        if(i < 0) throw new IllegalArgumentException("Invalid capacity argument");
        arr = (T[]) new Object[i];
        size = 0; // seem to be index
        capacity = i;
    }

    @Override
    public void add(T elem) {
        add(size,elem);
    }

    @Override
    public void remove(T elem) {
        remove(indexOf(elem));
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
    //case intervene,last,not enough capa
    public void add(int index, T elem) {
        if(size+1>=capacity){
            capacity *= 2;
            T[] tempArray = (T[]) new  Object[capacity];
            for(int j = 0;j<size;j++){
                tempArray[j] = arr[j];
            }
            arr = tempArray;
        }
        if(index<size){
            T[] tempArray = (T[]) new Object[capacity] ;
            for(int i = 0;i<size+1;i++){
                if(i<index){
                   tempArray[i] = arr[i];
                } else if(i==index){
                    tempArray[i] = elem;
                }
                else{
                    tempArray[i] = arr[i-1];
                }
            }
            arr = tempArray;
        }else{
            arr[index] = elem;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        T temp;
        if(index == -1) throw new IllegalArgumentException("Invalid Index");
        for(int i = index;i<size+1;i++){
            arr[i] = arr[i+1];
        }
    }

    @Override
    public T get(int i) {
        return arr[i];
    }

    @Override
    public void set(int i, T elem) {
        arr[i] = elem;
    }

    public int indexOf(T elem){
        for(int i =0;i<size;i++){
            if(arr[i].equals(elem)) return i;
        }
        return -1;
    }

    public  void printArray(){
        System.out.println("===========Array==========");
        for (int i = 0 ; i<size ;i++){
            System.out.println(get(i));
        }
    }
}
