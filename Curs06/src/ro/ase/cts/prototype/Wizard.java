package ro.ase.cts.prototype;

public class Wizard extends Character {
    private int power;

    public Wizard() {
        System.out.println("Loading...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render() {
        System.out.println("The wizard was rendered");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Wizard copy = (Wizard) super.clone();
        copy.power = power;
        return copy;
    }
}
