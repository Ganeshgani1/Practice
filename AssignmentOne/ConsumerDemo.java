package AssignmentOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerDemo {

    public static <T> boolean check(T value,Predicate<T> predicate){
        /*if(value instanceof Integer){
            return ((Integer)value)%2==0;
        } else if (value instanceof String) {
            return ((String) value).startsWith("Mr.");
        }else if (value instanceof Person){
           return ((Person) value).getAge()>=18;
        }*/
        return predicate.test(value);
    }

    private static List<Person> getPeople() {

        List<Person> result = new ArrayList<>();

        result.add(new Person("Mike", 33, 1.8f));

        result.add(new Person("Mary", 25, 1.4f));

        result.add(new Person("Alan", 34, 1.7f));

        result.add(new Person("Zoe", 30, 1.5f));

        return result;

    }
    public static List<Person> sortAge(List<Person> list){

        //Collections.sort(list,(p1, p2)-> p1.getAge()- p2.getAge());
        list.sort((p1,p2)->p1.getAge()- p2.getAge());
        return list;
    }

    private static List<Person> sortPeopleByName(List<Person> listPeople) {
        listPeople.sort((p1,p2)->p1.getName().compareToIgnoreCase(p2.getName()));
        return listPeople;
    }

    // Pedicate<boolean> isEven = (value)-> value%2 == 0;
    //return isEvem
    public static void main(String[] args) {

        System.out.println("========Question-1=========");
        Consumer<String> consumer=(str)-> System.out.println(str);
        consumer.accept("Printable lambda");

        System.out.println("========Using method Reference=========");
        Consumer<String> consumerMR=System.out::println;
        consumerMR.accept("Printable lambda");

        System.out.println("========Question-2=========");
        Supplier<Integer> supplier=()->77;
        System.out.println(supplier.get());

        System.out.println("========Using method Reference=========");
        Supplier<Integer> supplierMR=supplier::get;
        System.out.println(supplierMR.get());

        System.out.println("========Question-3=========");
        Predicate<Integer> predicate=n->n<0;
        System.out.println(predicate.test(-1));
        System.out.println(predicate.test(1));

        System.out.println("========With custom FI=========");
        Evaluate<Integer> evaluate=p->p<0;
        System.out.println(evaluate.test(-1));
        System.out.println(evaluate.test(1));

        System.out.println("========Even check=========");
        System.out.println(check(4,n->n%2==0));
        System.out.println(check(7,n->n%2==0));

        System.out.println("========String check=========");
        System.out.println(check("Mr. Joe Bloggs",s->s.startsWith("Mr.")));
        System.out.println(check("Ms. Ann Bloggs",s->s.startsWith("Mr.")));

        System.out.println("========Age check=========");
        System.out.println(check(new Person("Mike",33,1.8f),p->p.getAge()>=18));
        System.out.println(check(new Person("Ann",13,1.4f),p->p.getAge()>=18));

        System.out.println("========Question-4=========");
        Functionable functionable=(n)->"Number is:"+n;
        System.out.println(functionable.pass(25));

        Function<Integer,String> function=(n)-> "Number is:"+n;
        System.out.println(function.apply(25));

        System.out.println("========Question-5=========");
        List<Person> listPeople=getPeople();
        listPeople.forEach(System.out::println);

        System.out.println("========Question-6=========");
        List<Person> sortPeople=sortAge(listPeople);
        listPeople.forEach(System.out::println);

        System.out.println("========Question-6 (b)=========");
        listPeople.forEach(p-> System.out.println(p));

        System.out.println("========Question-7=========");
        List<Person> sortByName=sortPeopleByName(listPeople);
        sortByName.forEach(System.out::println);

        System.out.println("========Question-7 (b)=========");
        sortByName.forEach(p-> System.out.println(p));

        System.out.println("========Question-8=========");
        List<Person> sortByHeight=SortPeopleByHeight(listPeople);
        sortByHeight.forEach(System.out::println);

        System.out.println("========Question-8 (b)=========");
        sortByHeight.forEach(p-> System.out.println(p));

        System.out.println("========Question-9=========");
        sortByName.forEach(System.out::println);
        sortByHeight.forEach(System.out::println);
        listPeople.forEach(System.out::println);

    }

    private static List<Person> SortPeopleByHeight(List<Person> listPeople) {
        listPeople.sort((p1,p2)->p1.getHeight().compareTo(p2.getHeight()));
        return listPeople;
    }


}

class Person{
    Integer age;
    String name;
    Float height;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Person( String name,Integer age, Float height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
