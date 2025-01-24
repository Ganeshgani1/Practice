package coreJava;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Vector;

public class Animal {
    public void eat(){
        System.out.println("The animal is eating");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }
}

class mainClass{
    public static void main(String[] args) {
       // Cat cat=new Animal();
//        Animal cat= new Cat();
//        cat.eat();
//        Animal dog=new Dog();
//        dog.eat();
//        Animal animal= new Animal();
//        animal.eat();
//        Cat cat1= new Cat();
//        cat1.eat();

//        PrintWriter out=new PrintWriter();
//        new OutputStreamWriter(System.out,true);
//        out.println("hello");

//        int a=10;
//        double b=10.1;
//        boolean c=(a==b);
//        System.out.println(c);

        int a=3;
        int b=2;
        System.out.println(a/b);
        System.out.println(a<b);
        System.out.println(a*4);
        System.out.println(a<<b);

        Float f1[] ,f2[];
        f1=new Float[10];
        f2=f1;
        System.out.println("f2[0]= "+f2[0]);

        Integer.valueOf(12);

    }
}

//public class While{
//    public void loop(){
//        int x=0;
//        Float f= new Float("12");
//        switch (f){
//            case 12:
//                System.out.println("twelve ");
//            default:
//                System.out.println("Default");
//        }
//    }
//}

//class MyVector extends Vector{

//}
