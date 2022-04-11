package ro.ase.cts.composite_v2;

import ro.ase.cts.composite.Receiver;

import java.util.ArrayList;
import java.util.List;

public class MailGroup implements EmailComposite{

    private List<Recipient> recipients = new ArrayList<Recipient>();

    @Override
    public void addRecipient(Recipient recipient) {
        if(!recipients.contains(recipient)){
            recipients.add(recipient);
        }
    }

    @Override
    public void removeRecipient(Recipient recipient) {
        if(recipients.contains(recipient)){
            recipients.remove(recipient);
        }
    }

    @Override
    public Recipient getRecipient(int position) {
        if(position >= 0 && position < recipients.size()){
            return recipients.get(position);
        } else {
            return null;
        }
    }

    @Override
    public void receive(String message) {
        for (Recipient recipient:recipients) {
            recipient.receive(message);
        }
    }
}
