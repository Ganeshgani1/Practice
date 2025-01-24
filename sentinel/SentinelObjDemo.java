package sentinel;
import java.util.Iterator;
import java.util.LinkedList;

public class SentinelObjDemo {
    public static void main(String[] args){
        LinkedList<Object> list= new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        Object sentinel="END";
        list.add(sentinel);
        //list.add(40);
        Iterator itr=list.iterator();
        while(itr.hasNext()){
              Object obj=itr.next();
              if(!obj.equals(sentinel))
                  System.out.println("The element is: "+obj);
              else
                  break;
        }
    }
}
