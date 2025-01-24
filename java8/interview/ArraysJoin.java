package java8.interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysJoin {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>(Arrays.asList(2,3,1,9,5,7,6));
        List<Integer> list2=new ArrayList<>(Arrays.asList(5,8,7,3,6,4,9));

        Integer[] arr=Stream.concat(Arrays.stream(list1.toArray()),Arrays.stream(list2.toArray())).sorted().toArray(Integer[]::new);

      //Object lists= Stream.concat(Arrays.stream(list1.toArray()),Arrays.stream(list2.toArray())).sorted().collect(Collectors.toList());

        Integer[] list= Stream.concat(Arrays.stream(list1.toArray()),Arrays.stream(list2.toArray())).sorted().toArray(Integer[]::new);
        Arrays.stream(list).forEach(System.out::println);
    }
}
