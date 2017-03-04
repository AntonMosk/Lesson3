/**
 * Created by anton on 2/26/17.
 */

public interface Flyable {

    int a = 15;
    final int a2 = 15;
    static int a3 = 15;
    static final int a4 = 15;

    // all definition below are the same
    void flyHigh();

    default void flyLower() {
        System.out.println("Hello again");
    }

    public static void doSomething() {
        System.out.println("Hello");
    }


}
