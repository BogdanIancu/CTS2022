package ro.ase.cts.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SpectatorFactory {
    private Map<String, Spectator> map = new HashMap<>();

    public Spectator getSpectator(String name) {
        if(!map.containsKey(name)) {
            FootballFan fan = new FootballFan();
            fan.setTeam("Academica Clinceni");
            map.put(name, fan);
        }
        return map.get(name);
    }
}
