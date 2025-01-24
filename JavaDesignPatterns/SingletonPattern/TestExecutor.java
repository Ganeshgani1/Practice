package JavaDesignPatterns.SingletonPattern;

import java.util.concurrent.Executor;

public class TestExecutor implements Runnable {
    @Override
    public void run() {
        SingletonThreadSafe singleton=SingletonThreadSafe.getSingleton();
        System.out.println(Thread.currentThread().getName()+" "+singleton.hashCode());
    }
}
