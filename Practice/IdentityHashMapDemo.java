package Practice;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args){
        IdentityHashMap<Integer,Integer> map= new IdentityHashMap<>();
        map.put(1,10);
        map.put(2,10);
        map.put(new Integer( 1),20);
        System.out.println("The map is: "+map);
        System.out.print("map values are: "+map.values());
    }
}
