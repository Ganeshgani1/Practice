package Practice;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args){
        LinkedHashMap<String,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("D","Dinesh");
        linkedHashMap.put("An","Anamika");
        linkedHashMap.put("Ar","Arnav");
        linkedHashMap.put("Ad","Adnan");
        linkedHashMap.putIfAbsent("Ak","Akhil");
        System.out.println("The linkedHashMap is: "+linkedHashMap);
    }
}
