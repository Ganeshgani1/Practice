package java8.interview;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequency {
    public static void main(String[] args) {
        String s="baranababarava";
//        char[] arr=s.toCharArray();
//        List<Character> charList= new ArrayList<>();
//        for(Character c:arr){
//            charList.add(c);
//        }
//        Map<Character,Long> charMap=s.chars().
//                mapToObj(c->(char) c).
//                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//                mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

//        mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<Character,Long> charMap=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        charMap.forEach(((character, value) -> System.out.println(character+ " : "+value)));


    }
}
