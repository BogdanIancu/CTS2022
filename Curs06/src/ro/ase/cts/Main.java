package ro.ase.cts;

import ro.ase.cts.adapter.Kahoot;
import ro.ase.cts.adapter.MoodleToKahootAdapter;
import ro.ase.cts.adapter.Moodle;
import ro.ase.cts.builder.Shampoo;
import ro.ase.cts.prototype.Wizard;

public class Main {

    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        wizard.render();

        try {
            Wizard wizard2 = (Wizard) wizard.clone();
            wizard2.render();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Shampoo shampoo =
                new Shampoo.ShampooBuilder().addProducer("P&G")
                        .addPrice(10).build();


        Kahoot kahoot = new MoodleToKahootAdapter(new Moodle());
        kahoot.displayQuestion();
    }
}
