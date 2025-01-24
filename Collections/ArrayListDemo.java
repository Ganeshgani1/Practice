package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        System.out.println(list);

        list.add(3);
        list.add(5);
        list.add(6);
        list.add(8);
        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" -->");
        }


        List<Employee> empList=new ArrayList<>();
        empList.add(new Employee("Gani",20000,21));
        empList.add(new Employee("lux",25000,31));
        empList.add(new Employee("raj",28000,20));
        empList.add(new Employee("Mani",29000,21));
        empList.add(new Employee("Varu",19000,21));

        //empList=empList.stream().sorted((e1,e2)->e2.getSalary().compareTo(e1.getSalary())).limit(3).collect(Collectors.toList());
        empList=empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList());
        empList.forEach(System.out::println);
        //System.out.println(list);
    }
}
