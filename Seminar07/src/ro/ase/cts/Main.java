package ro.ase.cts;

import com.ro.ase.cts.facade.CarCockpit;
import ro.ase.cts.composite.EmailAddress;
import ro.ase.cts.composite.EmailGroup;
import ro.ase.cts.composite.Receiver;
import ro.ase.cts.composite_v2.EmailComposite;
import ro.ase.cts.composite_v2.MailAddress;
import ro.ase.cts.composite_v2.MailGroup;
import ro.ase.cts.composite_v2.Recipient;

public class Main {

    public static void main(String[] args) {
        CarCockpit carCockpit = new CarCockpit();
        carCockpit.brake();
        carCockpit.accelerate();
        carCockpit.resetTemperature();
        carCockpit.displayTemperature();

        EmailGroup seriaD = new EmailGroup();
        EmailGroup grupa1084 = new EmailGroup();
        EmailGroup grupa1085 = new EmailGroup();
        EmailAddress student1 = new EmailAddress("dana.georgescu@csie.ro");
        EmailAddress student2 = new EmailAddress("andra.enache@csie.ro");
        EmailAddress student3 = new EmailAddress("ionel.popescu@csie.ro");

        grupa1084.addReceiver(student1);
        grupa1084.addReceiver(student2);
        grupa1085.addReceiver(student3);

        seriaD.addReceiver(grupa1084);
        seriaD.addReceiver(grupa1085);

        seriaD.receive("salutare");

        Recipient student4 = new MailAddress();
        Recipient student5 = new MailAddress();
        Recipient student6 = new MailAddress();
        EmailComposite grupa1086 = new MailGroup();
        grupa1086.addRecipient(student4);
        grupa1086.addRecipient(student5);
        grupa1086.addRecipient(student6);
        grupa1086.receive("s-au livrat bursele");

        EmailComposite grupa1087 = new MailGroup();
        Recipient student7 = new MailAddress();
        grupa1086.removeRecipient(student6);
        grupa1087.addRecipient(student7);
        grupa1086.addRecipient(grupa1087);
        Recipient student8 = new MailAddress();
        grupa1087.addRecipient(student8);
        System.out.println();

        grupa1086.receive("hello");
    }
}
