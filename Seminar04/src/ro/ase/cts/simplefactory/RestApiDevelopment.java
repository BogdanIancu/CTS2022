package ro.ase.cts.simplefactory;

public class RestApiDevelopment implements RestAPI {
    RestApiDevelopment(){}

    @Override
    public void connect() {
        System.out.println("Connecting to the development server");
    }
}
