package ro.ase.cts.factorymethod.documents;

public interface Document {
    String getName();

    void setName(String name);

    void open();
}

// daca toate documentele trb sa aiba un camp comun fac o clasa abstracta
// sau as putea sa pun getter sau setter absract
