package BehavirolDesignPattern.TemplateDesignPattern.GoodCode;

/*
    This will help in using the same template for multiple Implementations
*/
public class Main {
    public static void main(String[] args) {
        Beverage coffeeBeverage = new CoffeeBeverage();
        Beverage teaBeverage = new TeaBeverage();
        System.out.println("Preparing Coffee");
        coffeeBeverage.preareRecipe();
        System.out.println("Preparing Tea");
        teaBeverage.preareRecipe();
    }
}
