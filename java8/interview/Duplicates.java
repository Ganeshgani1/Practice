package java8.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {

    List<Integer> list=new ArrayList<>(Arrays.asList(1,1,2,3,5,2,9,6));
//    List<Integer> newList= new ArrayList<>();
//    newList.add(list.get(0));
//    for(Integer i:list){
//      if(!newList.contains(i)){
//          newList.add(i);
//      }
//    }
        list=list.stream().distinct().collect(Collectors.toList());
        list.stream().forEach(System.out::print);
//    list.stream().forEach(i ->{
//        if(!newList.contains(i)){
//            newList.add(i);
//        }
//    });
//    newList.forEach(System.out::println);
   }

}
