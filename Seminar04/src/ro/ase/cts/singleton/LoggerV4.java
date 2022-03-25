package ro.ase.cts.singleton;

import java.time.LocalDateTime;

public enum LoggerV4 {
    INSTANCE;

    public void log(String message) {
        System.out.println(LocalDateTime.now() + ": " + message);
    }
}
