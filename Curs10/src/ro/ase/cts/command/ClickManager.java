package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class ClickManager {
    private List<ButtonClick> events = new ArrayList<>();

    public void addEvent(ButtonClick buttonClick) {
        events.add(buttonClick);
    }

    public void executeEvents() {
        for(ButtonClick event : events) {
            event.execute();
        }
        events.clear();
    }
}
