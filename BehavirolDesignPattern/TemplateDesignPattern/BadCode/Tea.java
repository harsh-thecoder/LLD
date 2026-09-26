package BehavirolDesignPattern.TemplateDesignPattern.BadCode;

public class Tea {
    public void preare(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addSugarAndMilk();
    }

    private void boilWater(){
        System.out.println("Boiling Water");
    }

    private void steepTeaBag(){
        System.out.println("Steeping Tea Bag");
    }

    private void pourInCup(){
        System.out.println("Pouring in Cup");
    }

    // Can be lemon also 
    private void addSugarAndMilk(){
        System.out.println("Adding sugar and milk");
    }
}
