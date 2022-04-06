package ro.ase.cts.factorymethod;

public class ElectronicNotaryDocument implements Document {

    ElectronicNotaryDocument() {

    }

    @Override
    public void sign() {
        System.out.println("Documentul a fost semnat electronic in fata notarului");
    }
}
