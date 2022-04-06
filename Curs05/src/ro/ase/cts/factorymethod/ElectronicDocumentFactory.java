package ro.ase.cts.factorymethod;

import ro.ase.cts.factorymethod.exceptions.InvalidDocumentException;

public class ElectronicDocumentFactory implements AbstractDocumentFactory {
    public Document generateDocument(DocumentType documentType) throws InvalidDocumentException {
        if(documentType == DocumentType.AGREEMENT) {
            return new ElectronicAgreementDocument();
        } else if (documentType == DocumentType.NOTARY) {
            return new ElectronicNotaryDocument();
        } else {
            throw new InvalidDocumentException();
        }
    }
}
