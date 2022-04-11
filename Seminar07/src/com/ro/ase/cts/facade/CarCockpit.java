package com.ro.ase.cts.facade;

//Facade
public class CarCockpit {
    private Car car = new Car();
    private Engine engine =  new Engine();
    private Lights lights = new Lights();
    private TemperatureControl temperatureControl = new TemperatureControl();

    public void accelerate(){
        engine.setLoad(engine.getLoad()+1);
    }

    public void brake(){
        engine.setLoad(0);
        lights.turnOnBreakingLights();
    }

    public void turnOnHazardLights(){
        lights.turnOnLeftSignalLight();
        lights.turnOnRightSignalLight();
    }

    public void pressAlarmButton(){
        if(car.isAlarmOn()){
            car.setAlarmOn(false);
        } else {
            car.setAlarmOn(true);
        }
    }

    public void resetTemperature(){
        temperatureControl.setTemperature(20);
    }

    public void displayTemperature(){
        System.out.println(temperatureControl.getTemperature() + "*C");
    }
}
