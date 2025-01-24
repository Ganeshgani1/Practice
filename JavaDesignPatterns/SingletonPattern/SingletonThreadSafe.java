package JavaDesignPatterns.SingletonPattern;

public class SingletonThreadSafe {
    private static SingletonThreadSafe singleton=null;

    private SingletonThreadSafe(){

    }

    //1(Approach).It will break the singleton in case of multiple threads calling the method at the same time
    /*public static final SingletonThreadSafe getSingleton(){
        if (singleton==null){
            singleton= new SingletonThreadSafe();
        }
        return singleton;
    }*/

    //2(Approach).It will create singleton even multiple threads calling the method at the same time.
    /*public static final synchronized SingletonThreadSafe getSingleton(){
        if (singleton==null){
            singleton= new SingletonThreadSafe();
        }
        return singleton;
    }*/

    //3(Approach) . will aply synchronization over the class instead of method.
    public static final  SingletonThreadSafe getSingleton(){
        if(singleton==null) {
            synchronized(SingletonThreadSafe.class) {
                if (singleton == null) {
                    singleton = new SingletonThreadSafe();
                }
            }
        }
        return singleton;
    }


}
