package BehavirolDesignPattern.TemplateDesignPattern.GoodCode;

public class Main {
    public static void main(String[] args) {
        Beverage coffeeBeverage = new CoffeeBeverage();
        Beverage teaBeverage = new TeaBeverage();
        System.out.println("Preparing Coffee");
        coffeeBeverage.preareRecipe();
        System.out.println();
        System.out.println("Preparing Tea");
        teaBeverage.preareRecipe();
    }
}
