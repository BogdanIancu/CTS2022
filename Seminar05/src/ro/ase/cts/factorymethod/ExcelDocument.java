package ro.ase.cts.factorymethod;

import ro.ase.cts.factorymethod.documents.Document;

class ExcelDocument implements Document {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Opening excel document...");
    }
}
