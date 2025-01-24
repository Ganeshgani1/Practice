package Practice;

public class StringsDemo {
    public static void main(String[] args){
        String s="hey gani";
        final String s11="hey";
        String s12=s11+" gani";
        System.out.println(s);
        s.concat(" vivek");
        System.out.println(s);
        String s1=new String("hello");
        System.out.println(s1);
        s1.concat("Mr");
        System.out.println(s1);



        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(s12));
    }
}
