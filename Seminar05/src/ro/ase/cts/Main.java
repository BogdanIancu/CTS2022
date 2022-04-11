package ro.ase.cts;

import ro.ase.cts.factorymethod.AbstractDocumentFactory;
import ro.ase.cts.factorymethod.GoogleDocumentFactory;
import ro.ase.cts.factorymethod.documents.Document;
import ro.ase.cts.factorymethod.documents.DocumentType;
import ro.ase.cts.factorymethod.MicrosoftDocumentFactory;
import ro.ase.cts.factorymethod.exceptions.NoSuchDocumentException;
import ro.ase.cts.prototype.BuildingBlock;
import ro.ase.cts.prototype.WoodBlock;

public class Main {

    public static void main(String[] args) {
        AbstractDocumentFactory factory = new MicrosoftDocumentFactory();
        try {
            Document document = factory.create(DocumentType.TEXT);
            document.open();
        } catch (NoSuchDocumentException e) {
            e.printStackTrace();
        }

        factory = new GoogleDocumentFactory();
        try {
            Document document = factory.create(DocumentType.SPREADSHEET);
            document.open();
        } catch (NoSuchDocumentException e) {
            e.printStackTrace();
        }

        BuildingBlock block1 = new WoodBlock();
        block1.setX(0);
        block1.setY(0);
        block1.setZ(0);
        block1.render();

        BuildingBlock block2 = null;
        if (block1 instanceof Cloneable) {
            try {
                block2 = (BuildingBlock) block1.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            block2.setX(1);
            block2.setY(1);
            block2.setZ(1);
            block2.render();
        }

    }
}
