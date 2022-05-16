package ro.ase.cts.observer;

public class YoutubeSubscriber implements Observer{

    @Override
    public void receiveNotification(String message) {
        System.out.println("A new video uploaded: " + message);
    }
}
