package vehicle;

/**
 * Created by anton on 2/25/17.
 */
public class Chassis {

    private Engine engine;
    private Starter starter;

    public Chassis(Engine engine) {
        this.engine = engine;
    }

    public void startVehicle() {
        starter.startEngine(engine);
    }
}
