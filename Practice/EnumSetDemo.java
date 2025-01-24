package Practice;

import java.util.EnumSet;

public class EnumSetDemo {
    enum  Status{
        OPEN, IN_PROGRESS, AWAITING, DONE, CLOSED
    }
    public static void main(String[] args){
        EnumSet<Status> set=EnumSet.range(Status.AWAITING,Status.CLOSED);
        System.out.println(" The set is: "+set);
    }
}
