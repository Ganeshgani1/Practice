package Practice;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(2,22);
        map.put(3,33);
        map.put(4,44);
        System.out.println("The map is :"+ map);
        System.out.println("map values are :"+map.values());
    }
}
