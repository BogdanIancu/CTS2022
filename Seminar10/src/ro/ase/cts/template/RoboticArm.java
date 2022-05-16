package ro.ase.cts.template;

import ro.ase.cts.command.PastaOrder;

public class RoboticArm extends PartMover {
    @Override
    protected void liftPart() {
        System.out.println("Bratul robotic a ridicat piesa");
    }

    @Override
    protected void transportPart() {
        System.out.println("Bratul robotic transporta piesa");
    }

    @Override
    protected void dropPart() {
        System.out.println("Bratul robotic a mutat piesa");
    }
}
