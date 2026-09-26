package BehavirolDesignPattern.StateDesignPattern.BadCode;

public class TrafficLight {
    private String color;
    public TrafficLight(){
        this.color = "RED";
    }

    public void next(){
        if(color.equals("RED")){
            color = "GREEN";
            System.out.println("Light changed from Red to Green");
        } else if(color.equals("GREEN")){
            color = "YELLOW";
            System.out.println("Light changed from Green to Yellow");
        } else if(color.equals("YELLOW")){
            color = "RED"; 
            System.out.println("Light changed from Yellow to Red");
        }
    }

    public String getColor(){
        return color;
    }
}
