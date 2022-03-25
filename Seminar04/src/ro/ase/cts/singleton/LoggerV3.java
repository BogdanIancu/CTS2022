package ro.ase.cts.singleton;

import java.time.LocalDateTime;

public class LoggerV3 {
    public static final LoggerV3 instance;

    static {
        instance = new LoggerV3();
    }

    private LoggerV3() {
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + ": " + message);
    }
}
