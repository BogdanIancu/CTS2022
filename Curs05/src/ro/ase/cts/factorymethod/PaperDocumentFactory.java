package ro.ase.cts.factorymethod;

import ro.ase.cts.factorymethod.exceptions.InvalidDocumentException;

public class PaperDocumentFactory implements AbstractDocumentFactory{
    public Document generateDocument(DocumentType documentType) throws InvalidDocumentException {
        if(documentType == DocumentType.AGREEMENT) {
            return new PersonalAgreementDocument();
        } else if (documentType == DocumentType.NOTARY) {
            return new NotaryDocument();
        } else {
            throw new InvalidDocumentException();
        }
    }
}
