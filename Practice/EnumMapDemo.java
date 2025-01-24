package Practice;

import java.util.EnumMap;

enum Days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class EnumMapDemo {
    public static void main(String[] args){
        EnumMap<Days,String> map= new EnumMap<>(Days.class);
        map.put(Days.SUNDAY,"Holiday");
        map.put(Days.MONDAY,"working day");
        map.put(Days.TUESDAY,"Working day");
        System.out.println("The map is: "+map);
        System.out.println("Map size is: "+map.size());
    }
}
