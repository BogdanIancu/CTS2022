package ro.ase.cts.command;

public class PizzaOrder implements FoodOrder{
    private Chef chef;

    public PizzaOrder(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void cook() {
        chef.cookPizza();

    }
}
