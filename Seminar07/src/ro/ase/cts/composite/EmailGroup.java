package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;

public class EmailGroup implements Receiver{

    private List<Receiver> receivers = new ArrayList<Receiver>();

    @Override
    public void receive(String message) {
        for (Receiver receiver: receivers) {
            receiver.receive(message);
        }
    }

    @Override
    public void addReceiver(Receiver receiver) {
        if(!receivers.contains(receiver)){
            receivers.add(receiver);
        }
    }

    @Override
    public void removeReceiver(Receiver receiver) {
        if(receivers.contains(receiver)){
            receivers.remove(receiver);
        }
    }

    @Override
    public Receiver getReceiver(int position) {
        if(position >= 0 && position < receivers.size()){
            return receivers.get(position);
        } else {
            return null;
        }
    }
}
