package vehicle;

import java.util.List;

/**
 * Created by anton on 2/25/17.
 */
public class Engine {
    private List<Piston> pistonList;

    private Turbine turbine;


    private int PISTON_AMOUNT_FOR_CURRENT_MODEL;

    private boolean isEngineWorking;

/*    public List<Piston> getPiston() {

    }*/

    public void setPistonLst(List<Piston> pistonList) {

    }

    public boolean isPistonsWasInstalled() {
        return pistonList.size() == PISTON_AMOUNT_FOR_CURRENT_MODEL;
    }

/*    public Turbine getTurbine() {

    }*/

    public void setTurbine(Turbine turbine) {
        this.turbine = turbine;
    }

    protected void start() {
        if (isEngineWorking) {
            System.out.println("Engine has already worked");
            return;
        }
        isEngineWorking = true;
        System.out.println("Engine has been started");
    }
}
