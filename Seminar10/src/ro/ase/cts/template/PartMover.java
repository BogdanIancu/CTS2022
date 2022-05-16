package ro.ase.cts.template;

public abstract class PartMover {
    protected abstract void liftPart();
    protected abstract void transportPart();
    protected abstract void dropPart();

    public final void movePart(){
        liftPart();
        transportPart();
        dropPart();
    }
}
