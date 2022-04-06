package ro.ase.cts.factorymethod;

public class ElectronicAgreementDocument implements Document{
    ElectronicAgreementDocument() {
    }

    @Override
    public void sign() {
        System.out.println("Documentul a fost semnat electronic");
    }
}
