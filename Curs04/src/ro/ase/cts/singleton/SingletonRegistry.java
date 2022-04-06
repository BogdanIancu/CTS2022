package ro.ase.cts.singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    private Map<String, Object> registry = new HashMap();

    public SingletonRegistry() {
        registry.put("connection1", DbConnection.getConnection());
        registry.put("connection2", DbConnection2.CONNECTION);
    }

    public <T> T getSingleton(String name) {
        return (T)registry.get(name);
    }
}
