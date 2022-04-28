package ro.ase.cts.decorator;

public class CarWithAlarm extends AbstractCarDecorator{
    private boolean isAlarmOn;

    public CarWithAlarm(Vehicle vehicle) {
        super(vehicle);
    }

    public void pressAlarmButton(){
        isAlarmOn = !isAlarmOn;
    }

    @Override
    public void stop() {
        super.stop();
        isAlarmOn = true;
    }
}
