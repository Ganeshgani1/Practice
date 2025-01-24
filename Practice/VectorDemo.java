package Practice;

import java.util.Vector;

public class VectorDemo{
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(10);
        vector.add(10);
        vector.add(13);
        vector.add(11);
        vector.add(12);
        System.out.println("The vector is: " + vector);
        System.out.println("The vector capacity is: "+vector.capacity());
        vector.trimToSize();
        System.out.println("The capacity after trim is: "+vector.capacity());
    }
}
