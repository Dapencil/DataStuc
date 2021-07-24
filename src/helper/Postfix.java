package helper;

import adt.Stack;

import java.util.StringTokenizer;

public class Postfix {
    public String[] toPostfix(String infix){
        Stack st = new Stack();
        String[] arrayPostfix = new String[infix.length()];
        String str;
        int index = 0;
        String delimiter = "+-*/()";
        StringTokenizer infixToken = new StringTokenizer(infix,delimiter,true);
        while(infixToken.hasMoreTokens()){
            str = infixToken.nextToken();
            if(str.equals("(")) continue;
            if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")){
                st.push(str);
            } else if(str.equals(")")){
                arrayPostfix[index] = (String) st.pop();
                index++;
            } else {
                arrayPostfix[index] = str;
                index++;
            }
        } return arrayPostfix;
    }

    public void printArray(String[] arrayPostfix){
        int i = 0;
        while(arrayPostfix[i]!=null){
            System.out.print(arrayPostfix[i]);
            i++;
        }
        System.out.println();
    }

    public int calPostFix(String[] postfix){
        Stack st = new Stack();
        int a,b,c;
        int i = 0;
        while(postfix[i]!=null){
            if(postfix[i].equals("+")){
                b = (Integer) st.pop();
                a = (Integer) st.pop();
                c = a+b;
                st.push(c);
            }
            else if(postfix[i].equals("-")) {
                b = (Integer) st.pop();
                a = (Integer) st.pop();
                c = a - b;
                st.push(c);
            }
            else if(postfix[i].equals("*")){
                b = (Integer) st.pop();
                a = (Integer) st.pop();
                c = a*b;
                st.push(c);
            }
            else if(postfix[i].equals("/")){
                b = (Integer) st.pop();
                a = (Integer) st.pop();
                c = a/b;
                st.push(c);
            }else{
                st.push(Integer.parseInt(postfix[i]));
            }
            i++;
        }
        return (Integer) st.pop();
    }
}
