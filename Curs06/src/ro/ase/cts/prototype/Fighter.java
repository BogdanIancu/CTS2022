package ro.ase.cts.prototype;

public class Fighter extends Character {
    private int power;

    public Fighter() {
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
        Fighter copy = (Fighter) super.clone();
        copy.power = power;
        return copy;
    }
}
