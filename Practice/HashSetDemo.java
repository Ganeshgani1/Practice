package Practice;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet<Integer> set= new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println("the set is: "+set);
        set.forEach(element -> System.out.println("The element is: "+element));
    }
}
