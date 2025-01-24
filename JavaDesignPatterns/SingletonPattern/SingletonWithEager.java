package JavaDesignPatterns.SingletonPattern;

public class SingletonWithEager {
    private static final SingletonWithEager singleton=new SingletonWithEager();

    private SingletonWithEager(){

    }

    public static final SingletonWithEager getSingleton(){
        return  singleton;
    }


}
