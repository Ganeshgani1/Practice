package java8.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddAndEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(2,3,5,6,4,9,7,8));
        List<Integer> oddList=list.stream().filter(i->i%2 !=0).collect(Collectors.toList());
        oddList.forEach(System.out::println);
        System.out.println("=============even=============");
        List<Integer> evenList=list.stream().filter(i->i%2==0).collect(Collectors.toList());
        evenList.forEach(System.out::println);
    }
}
