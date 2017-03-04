/**
 * Created by anton on 2/26/17.
 */
public interface Flyable2 extends Flyable {

    @Override
    default void flyHigh() {
        System.out.println("Hello from Flyable2");
    }

    @Override
    void flyLower();

}
