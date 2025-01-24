package JavaDesignPatterns.SingletonPattern;

public class SingletonWithStatic {
    private static SingletonWithStatic singleton=null;
    static{
        try{
            if(singleton==null){
                singleton=new SingletonWithStatic();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private SingletonWithStatic(){
    }

    public static final SingletonWithStatic getSingleton(){
        return singleton;
    }
}
