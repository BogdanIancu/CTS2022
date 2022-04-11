package ro.ase.cts.factorymethod;

import ro.ase.cts.factorymethod.documents.Document;
import ro.ase.cts.factorymethod.documents.DocumentType;
import ro.ase.cts.factorymethod.exceptions.NoSuchDocumentException;

public class MicrosoftDocumentFactory implements AbstractDocumentFactory {
    @Override
    public Document create(DocumentType type) throws NoSuchDocumentException {
        if(type == DocumentType.TEXT){
            return new WordDocument();
        } else if(type == DocumentType.SPREADSHEET){
            return new ExcelDocument();
        } else {
            throw new NoSuchDocumentException();
        }
    }
}
