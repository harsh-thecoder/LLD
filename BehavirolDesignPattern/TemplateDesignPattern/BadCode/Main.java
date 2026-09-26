package BehavirolDesignPattern.TemplateDesignPattern.BadCode;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.preare();
        System.out.println();
        Tea tea = new Tea();
        tea.preare();
    }
}
