import list_im_arr.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList testArray = new ArrayList();
//        testArray.add(20);
//        testArray.add(30);
        for(int i =0;i<20;i++) testArray.add(Integer.toString(i));
        testArray.remove("10");
        testArray.printArray();

    }
}
