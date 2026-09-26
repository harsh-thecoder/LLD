package BehavirolDesignPattern.TemplateDesignPattern.BadCode;

public class Coffee {
    public void preare(){
        boilWater();
        brewCoffee();
        pourInCup();
        addSugarAndMilk();
    }

    private void boilWater(){
        System.out.println("Boiling Water");
    }

    private void brewCoffee(){
        System.out.println("Brewing Coffee");
    }

    private void pourInCup(){
        System.out.println("Pouring in Cup");
    }

    private void addSugarAndMilk(){
        System.out.println("Adding sugar and milk");
    }
}
