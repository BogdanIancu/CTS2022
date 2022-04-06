package ro.ase.cts.factorymethod;

import ro.ase.cts.factorymethod.exceptions.InvalidDocumentException;

public interface AbstractDocumentFactory {
    Document generateDocument(DocumentType documentType)
            throws InvalidDocumentException;
}
