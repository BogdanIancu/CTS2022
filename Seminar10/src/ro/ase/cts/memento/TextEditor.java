package ro.ase.cts.memento;

public class TextEditor {
    TextDocument document=new TextDocument();
    DocumentMemento history = new DocumentMemento();

    public TextEditor() {
        this.document.setText("");
    }

    public void save(){
        history.addDocument(document);
    }

    public void undo(){
        document = history.getPreviousVersion();
    }

    public void typeText(String text){
        this.document.appendText(text);
    }

    @Override
    public String toString() {
        return document.getText();
    }
}
