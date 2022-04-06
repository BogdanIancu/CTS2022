package ro.ase.cts;

import ro.ase.cts.factorymethod.*;
import ro.ase.cts.factorymethod.exceptions.InvalidDocumentException;

public class Main {

    public static void main(String[] args) {
        AbstractDocumentFactory factory = new ElectronicDocumentFactory();
        try {
            Document document =
                    factory.generateDocument(DocumentType.NOTARY);
            document.sign();
        } catch (InvalidDocumentException e) {
            e.printStackTrace();
        }
    }
}
