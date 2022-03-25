package ro.ase.cts.simplefactory;

public class RestApiProduction implements RestAPI{
    RestApiProduction() {}

    @Override
    public void connect() {
        System.out.println("Connecting to the production");
    }
}
