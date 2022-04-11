package ro.ase.cts.factorymethod;

import ro.ase.cts.factorymethod.documents.Document;
import ro.ase.cts.factorymethod.documents.DocumentType;
import ro.ase.cts.factorymethod.exceptions.NoSuchDocumentException;

public interface AbstractDocumentFactory {
    Document create(DocumentType type) throws NoSuchDocumentException;
}
