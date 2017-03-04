package Test2;

import polymorphism.Animal;
import polymorphism.Dog;
import polymorphism.Dolphin;

/**
 * Created by anton on 2/25/17.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dolphin dolphin = new Dolphin();

        doSomething(dog);
        doSomething(dolphin);
        dog.bark();

        Animal newDog = new Dog();
        Animal newDolphin = new Dolphin();

        doSomething(newDog);
        doSomething(newDolphin);
//        newDog.bark(); - ошибка компиляции
    }

    public  static void doSomething(Animal animal) {
        animal.breath();
    }
}
