package ro.ase.cts;

import ro.ase.cts.command.Backend;
import ro.ase.cts.command.ClickManager;
import ro.ase.cts.command.LoginButtonClick;
import ro.ase.cts.command.RegisterButtonClick;
import ro.ase.cts.memento.VideoEditor;
import ro.ase.cts.observer.NewsletterSubscriber;
import ro.ase.cts.observer.Website;

public class Main {

    public static void main(String[] args) {
        Backend nodeJsBackend = new Backend();
        ClickManager clickManager = new ClickManager();
        clickManager.addEvent(new RegisterButtonClick(nodeJsBackend));
        clickManager.addEvent(new LoginButtonClick(nodeJsBackend));
        clickManager.executeEvents();

        Website website = new Website();
        NewsletterSubscriber subscriber1 =
                new NewsletterSubscriber("ionel@gmail.com");
        NewsletterSubscriber subscriber2 =
                new NewsletterSubscriber("maria@yahoo.com");
        website.subscribe(subscriber1);
        website.subscribe(subscriber2);
        website.sendNewsletter();
        System.out.println();
        website.unsubscribe(subscriber2);
        website.sendNewsletter();

        VideoEditor videoEditor = new VideoEditor("video1");
        videoEditor.save();
        videoEditor.edit(5);
        videoEditor.save();
        videoEditor.edit(10);
        videoEditor.getStatus();
        videoEditor.undo();
        videoEditor.getStatus();
        videoEditor.undo();
        videoEditor.getStatus();
    }
}
