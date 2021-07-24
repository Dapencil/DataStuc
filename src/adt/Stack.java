package adt;

public class Stack {
    private Object[] stack;
    private int top;

    public Stack() {
        stack = new Object[10];
        top = -1;
    }

    public int size(){ return top+1;}

    public void push(Object o){
        if(top == stack.length-1) stack = doubleSize(stack);
        top++;
        stack[top] = o;

    }

    private static Object[] doubleSize(Object[] origin){
        Object[] temp = new Object[origin.length*2];
        System.arraycopy(origin,0,temp,0,origin.length);
        return temp;
    }

    public Object pop(){
        if(isEmpty()) return null;
        Object e = stack[top];
        top--;
        return e;
    }

    public boolean isEmpty(){ return top==-1;}
}
