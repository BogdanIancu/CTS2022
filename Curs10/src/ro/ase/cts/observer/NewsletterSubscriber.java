package ro.ase.cts.observer;

public class NewsletterSubscriber implements Observer {
    private String email;

    public NewsletterSubscriber(String email) {
        this.email = email;
    }

    //...

    @Override
    public void notification() {
        System.out.println("New email received by " + email);
    }
}
