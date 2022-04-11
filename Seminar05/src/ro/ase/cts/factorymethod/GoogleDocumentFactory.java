package ro.ase.cts.factorymethod;

import ro.ase.cts.factorymethod.documents.Document;
import ro.ase.cts.factorymethod.documents.DocumentType;
import ro.ase.cts.factorymethod.documents.GoogleDoc;
import ro.ase.cts.factorymethod.documents.GoogleSpreadsheet;
import ro.ase.cts.factorymethod.exceptions.NoSuchDocumentException;

public class GoogleDocumentFactory implements AbstractDocumentFactory {
    @Override
    public Document create(DocumentType type) throws NoSuchDocumentException {
        if (type == DocumentType.TEXT) {
            return new GoogleDoc();
        } else if (type == DocumentType.SPREADSHEET) {
            return new GoogleSpreadsheet();
        } else {
            throw new NoSuchDocumentException();
        }
    }
}
