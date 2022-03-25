package ro.ase.cts.singleton;

import java.time.LocalDateTime;

public class LoggerV2 {
    private static final LoggerV2 logger = new LoggerV2();

    private LoggerV2() {
    }

    public static synchronized LoggerV2 getInstance() {
        return logger;
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + ": " + message);
    }
}
