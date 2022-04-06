package ro.ase.cts.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String, Character> registry =
            new HashMap<>();

    public PrototypeRegistry() {
        registry.put("wizard", new Wizard());
        registry.put("fighter", new Fighter());
    }

    public Character getCharacter(String type) throws CloneNotSupportedException {
        return (Character) registry.get(type).clone();
    }
}
