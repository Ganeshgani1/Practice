package JavaDesignPatterns.PrototypePattern;

public class Test {
    public static void main(String[] args) {
        Student s=new Student(1,"Gani");
        Student s2=new Student(2,"Mani");

        System.out.println(s);
        System.out.println(s2);

        Student s3=s.clone();
        s3.setId(23);
        System.out.println(s3);
    }
}
