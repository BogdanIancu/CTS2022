package ro.ase.cts.decorator;

public class CarWithSportSeats extends AbstractCarDecorator{
    private String seatsProducer;

    public CarWithSportSeats(Vehicle vehicle) {
        super(vehicle);
    }

    public String getSeatsProducer() {
        return seatsProducer;
    }

    public void setSeatsProducer(String seatsProducer) {
        this.seatsProducer = seatsProducer;
    }
}
