package Practice;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args){
        Set<Integer> set= new HashSet<>();

        Set<Integer> set1= new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(4);
        set.addAll(set1);
        System.out.println("The elements are : "+set);
    }
}
