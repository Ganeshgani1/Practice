package Practice;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class StringDedublicationDemo {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        int count=0;
        //while(true){
            for (int i=0;i<10;i++){
                for(int j=0; j<10;j++){
                    list.add(new String("hi")+j);
                }
            }
            Iterator itr= list.iterator();
            while(itr.hasNext()){
                System.out.println("the string is "+itr.next());
                count ++;
                System.out.println("The count is: "+count);
            }
        //}
        try{

        }catch (Throwable e){
            PrintStream obj= new PrintStream(System.out);
            e.getStackTrace();
        }
    }
}
