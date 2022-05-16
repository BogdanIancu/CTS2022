package ro.ase.cts.command;

public class PastaOrder implements FoodOrder{
    private Chef chef;

    public PastaOrder(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void cook() {
        chef.cookPasta();
    }
}
