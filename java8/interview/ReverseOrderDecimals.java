package java8.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrderDecimals {
    public static void main(String[] args) {
        List<Double> decimals=new ArrayList<>(Arrays.asList(10.1,10.2,12.0,10.5,13.0,12.8));
        decimals=decimals.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        decimals.forEach(System.out::println);
    }
}
