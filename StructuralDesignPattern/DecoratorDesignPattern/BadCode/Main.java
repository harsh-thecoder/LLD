package StructuralDesignPattern.DecoratorDesignPattern.BadCode;

import java.util.Scanner;

/*
   This is mainly used for dynamically wrapany additional functionality around existing objects
   Layering or Decorating Items can be different 
   So, Decorator is used to give that flexibility
*/
public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter your coffee order : ");
         String coffeeOrder = scanner.nextLine();

         if(coffeeOrder.equalsIgnoreCase("Espresso with Milk and Sugar")){
            System.out.println("Preparing espresso with milk and sugar");
         } else if(coffeeOrder.equalsIgnoreCase("Cappuccino with Vanilla")){
            System.out.println("Preparing Cappuccino with vanilla");
         } else{
            System.out.println("Order not recognized");
         }
    }
    
}
