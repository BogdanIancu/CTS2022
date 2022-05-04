package ro.ase.cts.state;

public class EmergencyState implements CarState {
    @Override
    public void doAction() {
        System.out.println("Applying full brake");
    }
}
