package Practice;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet<Integer> treeSet= new TreeSet<>();
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(4);
        treeSet.add(8);
        System.out.println("The TreeSet is: "+treeSet);
        treeSet.stream().forEach(i ->System.out.println("The element is: "+i));
    }
}
