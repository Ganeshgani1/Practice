package Practice;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap<Integer,String> treeMap= new TreeMap<>();
        treeMap.put(23,"Gani");
        treeMap.put(46,"mani");
        treeMap.put(5,"sumi");
        treeMap.put(90,"vardhan");
        System.out.println("the map is: "+treeMap);
        System.out.print("the headmap is: "+treeMap.headMap(46,false));
    }
}
