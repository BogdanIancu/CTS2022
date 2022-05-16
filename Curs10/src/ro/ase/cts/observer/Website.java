package ro.ase.cts.observer;

public class Website extends Observable {
    private String address;
    //...

    public void sendNewsletter() {
        super.notifyObservers();
    }
}
