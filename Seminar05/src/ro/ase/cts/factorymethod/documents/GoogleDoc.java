package ro.ase.cts.factorymethod.documents;

public class GoogleDoc implements Document {
    String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Opening google doc...");
    }
}
