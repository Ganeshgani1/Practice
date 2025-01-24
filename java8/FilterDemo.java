package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FilterDemo {

    public static void main(String[] args){

        List<Integer> list= Arrays.asList(2,5,3,6,1,8,4,7);
        list=list.stream().filter(n->n>3).collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println("---------------------------------------------");
        Integer total=list.stream().reduce(0,(a,b)->a+b);
        System.out.println(total);
        System.out.println("---------------------------------------------");
        Integer size=list.stream().collect(Collectors.toList()).size();
        System.out.println(size);
        System.out.println("---------------------------------------------");
        System.out.println(list.stream().allMatch(n->n<=6));
        System.out.println("---------------------------------------------");
        System.out.println(list.stream().anyMatch(n->n<=6));
        System.out.println("---------------------------------------------");
        System.out.println(list.stream().count());
        System.out.println("---------------------------------------------");
        list=list.stream().dropWhile(n->n>6).collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println("---------------------------------------------");
        list=list.stream().sorted().collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println("---------------------------------------------");
        list=list.stream().dropWhile(n->n>6).collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println("---------------------------------------------");
        list=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println("---------------------------------------------");
        list=list.stream().limit(2).collect(Collectors.toList());
        list.forEach(System.out::println);

        Consumer<List<Integer>> sort=Collections::sort;
        
    }

    // The stream() is used to perform operation on the collections.
    // The filter always accepts the input function Predicate which accepts the input and returns bolean value(true/false)
    // The returned output will be same or different based on the condition.
}
