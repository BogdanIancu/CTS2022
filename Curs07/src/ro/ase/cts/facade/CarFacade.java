package ro.ase.cts.facade;

public class CarFacade {
    private Car car = new Car();
    private TemperatureControl temperatureControl = new TemperatureControl();

    public void accelerate() {
        if(car.getSpeed() < 200) {
            car.setSpeed(car.getSpeed() + 5);
        }
    }

    public void brake() {
        if(car.getSpeed() >= 5) {
            car.setSpeed(car.getSpeed() - 5);
        }
    }

    public void increaseTemperature() {
        temperatureControl.setTemperature(temperatureControl.getTemperature() + 1);
    }

    public void decreaseTemperature() {
        temperatureControl.setTemperature(temperatureControl.getTemperature() - 1);
    }

    public void pressAlarmButton() {
        if(car.isAlarmActivated()) {
            car.setAlarmActivated(false);
        } else {
            car.setAlarmActivated(true);
        }
    }
}
