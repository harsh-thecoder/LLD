package BehavirolDesignPattern.MementoDesignPattern;

/*
    Not much better Implementation it is just to understand the memento design patter 
    that how we actually undo a particular functionality
*/
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        HistoryEditor history = new HistoryEditor();

        editor.setText("Harsh kaise ho");
        System.out.println("Current text : " + editor.getText());
        history.push(editor.save());

        editor.setText("Kya haal chaal");
        System.out.println("Current text : " + editor.getText());
        history.push(editor.save());

        editor.setText("Sub badhiyan?");
        System.out.println("Current text : " + editor.getText());

        Memento previousState = history.pop();
        editor.restore(previousState);
        System.out.println("After undo text : " + editor.getText());
    }
}
