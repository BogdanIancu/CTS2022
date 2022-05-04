package ro.ase.cts.state;

public class AutonomousCar {
    private CarState carState;

    public AutonomousCar() {
        carState = new StationaryState();
        carState.doAction();
    }

    public void setCarState(CarState state) {
        this.carState = state;
    }

    public void driveMeToDestination(String destination) {
        System.out.println("Heading to: " +destination);
        carState = new DrivingState();
        carState.doAction();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        carState = new EmergencyState();
        carState.doAction();
        carState = new StationaryState();
        carState.doAction();
    }
}
