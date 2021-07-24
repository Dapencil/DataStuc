import helper.Postfix;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Postfix p = new Postfix();
//        String infix = "((5*3)-((2*3)/(1+1)))";
//        System.out.println("Infix: "+infix);
//        System.out.print("Postfix: ");
//        p.printArray(p.toPostfix(infix));
//        System.out.println("Cal of Post: "+p.calPostFix(p.toPostfix(infix)));
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(5);
        myArray.remove(0);
        System.out.println(myArray.toString());
        System.out.println(myArray.size());
    }
}
