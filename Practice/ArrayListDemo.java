package Practice;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(17);
        list.add(8);
        list.add(9);
        list.trimToSize();
        System.out.println("The list size is: "+list.size());
    }
}
