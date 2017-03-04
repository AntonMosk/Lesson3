package polymorphism;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by anton on 2/25/17.
 */
public class Dog extends Animal{

    public void breath() {
        System.out.println("Dog is breathing");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}


