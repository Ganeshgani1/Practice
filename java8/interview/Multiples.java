package java8.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Multiples {
    public static void main(String[] args) {
        //multiple of 5

        List<Integer> list= new ArrayList<>(Arrays.asList(20,50,35,40,62));
        list.stream().
                filter(i->i%5==0)
                .forEach(System.out::println);
    }
}
