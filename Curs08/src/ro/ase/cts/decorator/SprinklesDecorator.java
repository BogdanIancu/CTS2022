package ro.ase.cts.decorator;

public class SprinklesDecorator extends AbstractDecorator {
    private int sprinklesWeight;

    public SprinklesDecorator(Cake cake) {
        super(cake);
    }

    public int getSprinklesWeight() {
        return sprinklesWeight;
    }

    public void setSprinklesWeight(int sprinklesWeight) {
        this.sprinklesWeight = sprinklesWeight;
    }

    public void prepare() {
        System.out.println("The cake is ready");
    }
}
