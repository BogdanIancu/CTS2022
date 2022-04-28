package ro.ase.cts.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CustomCharacterFactory {
    private Map<Character, CustomCharacter> map = new HashMap<>();

    public TextCharacter getCharacter(Character character) {
        if(map.containsKey(character)) {
            return map.get(character);
        } else {
            CustomCharacter customCharacter = new CustomCharacter(character,"Arial",12);
            map.put(character,customCharacter);
            return customCharacter;

        }
    }
}
