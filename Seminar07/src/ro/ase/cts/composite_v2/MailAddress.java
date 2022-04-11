package ro.ase.cts.composite_v2;

public class MailAddress implements Recipient{
    @Override
    public void receive(String message) {
        System.out.println(message);
    }
}
