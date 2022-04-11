package ro.ase.cts.composite;

public class EmailAddress implements Receiver{

    private String address;

    public EmailAddress(String address) {
        this.address = address;
    }

    @Override
    public void receive(String message) {
        System.out.println(address + ": " + message);
    }

    @Override
    public void addReceiver(Receiver receiver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeReceiver(Receiver receiver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Receiver getReceiver(int position) {
        throw new UnsupportedOperationException();
    }
}
