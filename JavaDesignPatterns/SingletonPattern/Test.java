package JavaDesignPatterns.SingletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //SingletonWithEager singleton2=new SingletonWithEager();
        System.out.println("The Eager initialization of singleton");

        SingletonWithEager singleton=SingletonWithEager.getSingleton();
        SingletonWithEager singleton1=SingletonWithEager.getSingleton();
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());

        System.out.println("THe static initialization of singleton");
        //SingletonWithStatic singletonWithStatic=new SingletonWithStatic();
        SingletonWithStatic withStatic=SingletonWithStatic.getSingleton();
        SingletonWithStatic withStatic1=SingletonWithStatic.getSingleton();
        System.out.println(withStatic.hashCode());
        System.out.println(withStatic1.hashCode());

        System.out.println("THe lazy initialization of singleton");
        //SingletonWithLazy lazy=new SingletonWithLazy();
        SingletonWithLazy lazy1=SingletonWithLazy.getSingleton();
        SingletonWithLazy lazy2=SingletonWithLazy.getSingleton();
        System.out.println(lazy1.hashCode());
        System.out.println(lazy2.hashCode());

        System.out.println("The therad safe singleton initialization");
        ExecutorService service= null;
        TestExecutor thread=new TestExecutor();

        try {
            service=Executors.newFixedThreadPool(3);
            service.execute(thread);
            service.execute(thread);
            service.execute(thread);
            service.execute(thread);
            service.execute(thread);
            service.execute(thread);
            service.execute(thread);
        }catch (Exception e){
              e.printStackTrace();
        }finally {
            if(service==null)
                service.shutdown();
        }

        System.out.println("The therad safe singleton initialization BillPugh approach");
        BilPugSingleton pugSingleton=BilPugSingleton.getSingleton();
        BilPugSingleton pugSingleton1=BilPugSingleton.getSingleton();
        System.out.println(pugSingleton.hashCode());
        System.out.println(pugSingleton1.hashCode());

        System.out.println("Breaking singleton initialization using reflection");
        SingletonWithLazy single1=SingletonWithLazy.getSingleton();
        SingletonWithLazy single3=SingletonWithLazy.getSingleton();
        final var ref = new Object() {
            SingletonWithLazy single2 = null;
        };

        List<Constructor<?>> constructorList= Collections.singletonList(SingletonWithLazy.class.getDeclaredConstructor());
       /*for (Constructor<?> c:constructorList){
           c.setAccessible(true);
           Object obj=c.newInstance();
           single2=(SingletonWithLazy)obj;
       }*/
        constructorList.forEach((s)->{
            s.setAccessible(true);
            Object obj= null;
            try {
                obj = s.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
            ref.single2 =(SingletonWithLazy)obj;
        });

        System.out.println(single1.hashCode());
        System.out.println(single3.hashCode());
        System.out.println(ref.single2.hashCode());

    }
}
