package helper;

public class Myint implements Comparable{
    private int value;

    public Myint(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Myint{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Myint toCompare = (Myint) o;
        if(toCompare==null) return 0;
        if(this.value > toCompare.value){
            return 1;
        }else return 0;
    }
}
