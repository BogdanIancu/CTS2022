package ro.ase.cts.decorator;

public final class ChocolateCake implements Cake {
    private String flavor;

    @Override
    public void bake() {
        System.out.println("Baking for 40 mins");
    }
}
