package ro.ase.cts.state;

public class StationaryState implements CarState {
    @Override
    public void doAction() {
        System.out.println("Waiting");
    }
}
