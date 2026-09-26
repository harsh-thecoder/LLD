package BehavirolDesignPattern.MementoDesignPattern;

public class TextEditor {
    private String text;
    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    // A new snapshot is being created for the current state
    public Memento save(){
        return new Memento(text);
    }

    // Restores the state from the given memento
    public void restore(Memento memento){
        this.text = memento.getText();
    }
}
