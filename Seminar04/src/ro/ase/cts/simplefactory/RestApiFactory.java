package ro.ase.cts.simplefactory;

public class RestApiFactory {
    private static final String DEVELOPMENT = "development";
    private static final String PRODUCTION = "production";

    public RestAPI getInstance(String type) {
        if (DEVELOPMENT.equals(type)) {
            return new RestApiDevelopment();
        }
        if (PRODUCTION.equals(type)) {
            return new RestApiProduction();
        }
        return null;
    }
}
