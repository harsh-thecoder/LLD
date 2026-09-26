package BehavirolDesignPattern.MementoDesignPattern;

/*
    It basically saves a string everytime like SNAPSHOT
*/
public class Memento {
    private String text;
    public Memento(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
