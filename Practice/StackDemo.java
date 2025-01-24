package Practice;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args){
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("The stack is: "+stack);
        System.out.println("The search : "+stack.search(2));
    }
}
