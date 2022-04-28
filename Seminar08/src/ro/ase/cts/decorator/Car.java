package ro.ase.cts.decorator;

public final class Car implements Vehicle{
    private String producer;
    private int engineSize;

    @Override
    public void start() {
        System.out.println("The car is moving.");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopped.");
    }
}
