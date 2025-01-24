package Practice;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void  main(String[] args){
        LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(9);
        linkedHashSet.add(12);
        System.out.println("The LinkedHashSet is: " +linkedHashSet);
        System.out.print("The elements are: ");
        linkedHashSet.forEach(i -> System.out.print(i+ ","));
    }
}
