package ro.ase.cts.template;

public class Worker extends PartMover {
    @Override
    protected void liftPart() {
        System.out.println("Muncitorul a ridicat piesa");
    }

    @Override
    protected void transportPart() {
        System.out.println("Muncitorul transporta piesa");
    }

    @Override
    protected void dropPart() {
        System.out.println("Muncitorul a mutat piesa");
    }
}
