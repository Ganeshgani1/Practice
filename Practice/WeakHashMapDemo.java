package Practice;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args){
        WeakHashMap<Integer,Integer> weakHashMap=new WeakHashMap<>();
        weakHashMap.put(1,11);
        weakHashMap.put(2,22);
        weakHashMap.put(3,33);
        weakHashMap.put(4,44);
        System.out.println("The map is: "+weakHashMap);
        weakHashMap.replaceAll((key,val) ->{
            return val+100;
        });
        System.out.println("the new map is: "+weakHashMap);
    }
}
