import Lab.ArrayList;
import Lab.ArraySort;
import helper.Myint;

public class Main {
    public static void main(String[] args) {
        ArraySort<Myint> testArray = new ArraySort<Myint>();
        Myint first = new Myint(20);
        Myint second = new Myint(30);
        Myint third = new Myint(70);
        testArray.add(first);
        testArray.add(second);
        testArray.add(third);
        testArray.printArray();
        Myint fourth = new Myint(25);
        testArray.add(fourth);
        testArray.printArray();
        testArray.remove(first);
        testArray.printArray();
        Myint fifth = new Myint(35);
        testArray.printArray();
        Myint sixth = new Myint(50);
        testArray.remove(sixth);
        //find elem
        System.out.println("Find elem");
        System.out.println(testArray.findElem(second));
        //show size
        System.out.println(testArray.size());

    }
}
