package java8.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {
    public static void main(String[] args) {
        List<String> strings=new ArrayList<>(Arrays.asList("Hey","Ganesh","How","are","You"));
        String st=strings.stream().map(s->s.concat(",")).map(String::new).collect(Collectors.joining());
        String st1=strings.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(st);
        System.out.println(st1);
    }
}
