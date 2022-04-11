package ro.ase.cts.composite_v2;

public interface EmailComposite extends Recipient{
    void addRecipient(Recipient recipient);
    void removeRecipient(Recipient recipient);
    Recipient getRecipient(int position);
}
