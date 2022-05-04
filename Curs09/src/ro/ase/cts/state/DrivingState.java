package ro.ase.cts.state;

public class DrivingState implements CarState {
    @Override
    public void doAction() {
        System.out.println("Driving automatically");
    }
}
