package JavaDesignPatterns.SingletonPattern;

public class SingletonWithLazy {

    private static SingletonWithLazy lazy=null;

    private SingletonWithLazy(){

    }
    public static SingletonWithLazy getSingleton(){
        try{
            if (lazy==null)
                lazy=new SingletonWithLazy();
        }catch (Exception e){
            e.printStackTrace();
        }
        return lazy;
    }
}
