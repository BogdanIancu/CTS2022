package ro.ase.cts;

import ro.ase.cts.exceptions.InvalidServerTypeException;
import ro.ase.cts.simplefactory.RestAPI;
import ro.ase.cts.simplefactory.RestApiFactory;
import ro.ase.cts.simplefactory.RestApiFactoryV2;
import ro.ase.cts.simplefactory.ServerType;
import ro.ase.cts.singleton.Logger;
import ro.ase.cts.singleton.LoggerV2;
import ro.ase.cts.singleton.LoggerV3;
import ro.ase.cts.singleton.LoggerV4;

public class Main {

    public static void main(String[] args) {
        //Singleton
        Logger logger = Logger.getInstance();
        logger.log("Hello world!");
        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Something");

        LoggerV2 loggerV2 = LoggerV2.getInstance();
        loggerV2.log("Logger v2");

        LoggerV3 loggerV3 = LoggerV3.instance;
        loggerV3.log("Logger v3");

        LoggerV4 loggerV4 = LoggerV4.INSTANCE;
        loggerV4.log("Logger v4");

        //SimpleFactory
        RestApiFactory restApiFactory = new RestApiFactory();
        RestAPI api = restApiFactory.getInstance("development");
        api.connect();

        RestApiFactoryV2 restApiFactoryV2 = new RestApiFactoryV2();
        try {
            RestAPI api2 = restApiFactoryV2.getInstance(ServerType.PRODUCTION);
            api2.connect();
        } catch (InvalidServerTypeException e) {
            e.printStackTrace();
        }
    }
}
