package ro.ase.cts.memento;

import java.util.ArrayList;
import java.util.List;

public class DocumentMemento {
    private List<TextDocument> history = new ArrayList<>();

    public void addDocument(TextDocument document){
        try {
            history.add((TextDocument) document.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    public TextDocument getPreviousVersion(){
        if(!history.isEmpty()){
            TextDocument document = history.get(history.size()-1);
            history.remove(document);
            return document;
        }
        throw new UnsupportedOperationException();
    }
}
