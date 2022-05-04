package ro.ase.cts.decorator;

public class CherryDecorator extends AbstractDecorator {

    public CherryDecorator(Cake cake) {
        super(cake);
    }

    public void addCherryOnTop() {
        System.out.println("Cherry added!");
    }
}
