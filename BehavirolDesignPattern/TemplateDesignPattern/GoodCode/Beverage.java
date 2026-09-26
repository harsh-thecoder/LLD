package BehavirolDesignPattern.TemplateDesignPattern.GoodCode;

public abstract class Beverage {
    final void preareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // These 2 methods will be same hence kept here only and rest methods will be different
    public void boilWater(){
        System.out.println("Boiling Water...");
    }

    public void pourInCup(){
        System.out.println("Pouring in the Cup");
    }

    abstract void brew();
    abstract void addCondiments();
}
