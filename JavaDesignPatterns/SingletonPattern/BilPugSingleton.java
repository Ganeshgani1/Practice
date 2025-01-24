package JavaDesignPatterns.SingletonPattern;

import com.sun.java.accessibility.util.AccessibilityListenerList;

public class BilPugSingleton {
    private BilPugSingleton(){

    }

    private static class SingletonHolder{
        private static final BilPugSingleton singleton=new BilPugSingleton();
    }

    public static BilPugSingleton getSingleton(){
        return SingletonHolder.singleton;
    }
}
