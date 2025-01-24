package java8.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(3,5,6,1,8,7,9));
        Integer max=list.stream().sorted().max(Integer::compareTo).get();
        Integer min=list.stream().sorted().min(Integer::compareTo).get();
        list=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        list.stream().forEach(System.out::print);
        System.out.println(" ");
        System.out.println(max+ " max & "+min + " min");
    }
}
