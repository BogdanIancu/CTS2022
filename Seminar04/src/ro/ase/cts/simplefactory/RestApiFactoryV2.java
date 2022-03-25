package ro.ase.cts.simplefactory;

import ro.ase.cts.exceptions.InvalidServerTypeException;

public class RestApiFactoryV2 {

    public RestAPI getInstance(ServerType type) throws InvalidServerTypeException {
        switch (type) {
            case DEVELOPMENT:
                return new RestApiDevelopment();
            case PRODUCTION:
                return new RestApiProduction();
            default:
                throw new InvalidServerTypeException();
        }
    }
}
