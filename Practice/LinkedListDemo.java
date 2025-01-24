package Practice;

import java.util.LinkedList;

@Serialize
public class LinkedListDemo{

    String name;
    String age;
    String designation;


    public static void main(String[] args){
        LinkedList<Integer> list= new LinkedList<>();
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(7);
        list.add(10);

        Integer[] arr=new Integer[list.size()];
        arr=list.toArray(arr);
        if(arr != null) {
            System.out.print("The array is :");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ",");
            }
        }
    }
}