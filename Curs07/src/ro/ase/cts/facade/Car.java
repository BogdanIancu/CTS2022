package ro.ase.cts.facade;

class Car {
    private String producer;
    //...
    private int speed;
    private boolean isAlarmActivated;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void emergencyBrake() {
        this.speed = 0;
    }

    public boolean isAlarmActivated() {
        return isAlarmActivated;
    }

    public void setAlarmActivated(boolean alarmActivated) {
        isAlarmActivated = alarmActivated;
    }
}
