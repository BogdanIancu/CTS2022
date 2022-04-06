package ro.ase.cts.factorymethod;

public class PersonalAgreementDocument implements Document{

    PersonalAgreementDocument() {

    }

    @Override
    public void sign() {
        System.out.println("Documentul a fost semnat in dublu exemplar");
    }
}
