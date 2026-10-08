package StructuralDesignPattern.DecoratorDesignPattern.GoodCode;

/*
    Likewise we can add any number of combinations easily 
    And layering can also be different like if something is inside that can be made outside and vice versa
*/
public class Main {
    public static void main(String[] args) {
         Coffee coffee = new Espresso();
         coffee = new MilkDecorator(coffee);
         coffee = new SugarDecorator(coffee);
         System.out.println(coffee.getDescription());
         System.out.println("The cost of the coffee is : " + coffee.getCost());

         Coffee coffee2 = new Cappuccino();
         coffee2 = new SugarDecorator(coffee2);
         coffee2 = new MilkDecorator(coffee2);
         System.out.println(coffee2.getDescription());
         System.out.println("The cost of the coffee is : " + coffee2.getCost());
    }
}
