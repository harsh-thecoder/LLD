package BehavirolDesignPattern.MementoDesignPattern;

import java.util.Stack;

public class HistoryEditor {
    private Stack<Memento> history = new Stack<>();
    public void push(Memento memento){
        history.push(memento);
    }

    public Memento pop(){
        if(!history.empty()){
            return history.pop();
        }
        return null;
    }
}
