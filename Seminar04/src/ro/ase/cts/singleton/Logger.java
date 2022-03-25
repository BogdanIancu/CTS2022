package ro.ase.cts.singleton;

import java.time.LocalDateTime;

public class Logger {
    private static Logger logger = null;

    private Logger() {
    }

    public static synchronized Logger getInstance() {
        if(logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + ": " + message);
    }
}
