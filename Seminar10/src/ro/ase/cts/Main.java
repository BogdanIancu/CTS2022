package ro.ase.cts;

import ro.ase.cts.command.*;
import ro.ase.cts.memento.TextEditor;
import ro.ase.cts.observer.YoutubeChannel;
import ro.ase.cts.observer.YoutubeSubscriber;
import ro.ase.cts.template.PartMover;
import ro.ase.cts.template.RoboticArm;
import ro.ase.cts.template.Worker;

public class Main {

    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel("Programare");
        YoutubeSubscriber youtubeSubscriber1 = new YoutubeSubscriber();
        YoutubeSubscriber youtubeSubscriber2 = new YoutubeSubscriber();

        youtubeChannel.subscribe(youtubeSubscriber1);
        youtubeChannel.subscribe(youtubeSubscriber2);

        youtubeChannel.publishVideo("Design Patterns");

        youtubeChannel.unsubscribe(youtubeSubscriber2);
        System.out.println("");

        youtubeChannel.publishVideo("Testare Unitară");

        Waiter waiter =new Waiter();
        Chef chef = new Chef();
        Chef chef1 = new Chef();

        waiter.addOrder(new PizzaOrder(chef));
        waiter.addOrder(new BurgerOrder(chef));
        waiter.addOrder(new PastaOrder(chef1));
        waiter.sendOrders();

        TextEditor editor = new TextEditor();
        editor.typeText("Apa trece");
        editor.save();
        editor.typeText(", pietrele raman");
        System.out.println(editor);
        editor.undo();
        System.out.println(editor);
        PartMover mover = new RoboticArm();
        mover.movePart();

        mover = new Worker();
        mover.movePart();
    }
}
