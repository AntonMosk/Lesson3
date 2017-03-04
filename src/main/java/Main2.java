import cars.Opel;
import vehicle.Engine;

/**
 * Created by anton on 2/25/17.
 */
public class Main2 {

    public static void main(String[] args) {
        Opel opel = new Opel(new Engine());
        Opel opel1 = new Opel(new Engine());
  //      opel.startVehicle();
        System.out.println(opel.getClass());
        Object opel2 = (Object) opel;
        System.out.println(opel2.getClass());
        System.out.println(opel.equals(opel1));
        System.out.println(opel1.equals(opel));
    }
}
