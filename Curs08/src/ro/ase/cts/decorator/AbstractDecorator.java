package ro.ase.cts.decorator;

public abstract class AbstractDecorator implements Cake {
    private Cake cake;

    public AbstractDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public void bake() {
        cake.bake();
    }
}
