package ro.ase.cts.factorymethod;

public class NotaryDocument implements Document {

    NotaryDocument() {
    }

    @Override
    public void sign() {
        System.out.println("Documentul a fost semnat in fata notarului");
    }
}
