package Practice;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args){
        Queue<Integer> queue= new PriorityQueue<>();
        queue.add(2);
        queue.add(3);
        queue.add(9);
        queue.add(6);
       Integer[] arr=new Integer[queue.size()];
       queue.toArray(arr);
        System.out.print("The queue elements are: ");
        for(int i=0;i< arr.length;i++) {
            System.out.print(arr[i]+", ");
        }
    }
}
