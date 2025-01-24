package Practice;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args){
        ArrayDeque<Integer> queue= new ArrayDeque<>();
        queue.add(2);
        queue.add(6);
        queue.add(9);
        queue.add(6);
        System.out.println("The array Deque is: "+queue);
        Integer[] arr= new Integer[queue.size()];
        queue.toArray(arr);
        System.out.print("The array elements are: ");
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+ ", ");
        }
    }
}
