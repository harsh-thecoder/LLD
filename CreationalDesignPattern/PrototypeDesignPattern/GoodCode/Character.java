package CreationalDesignPattern.PrototypeDesignPattern.GoodCode;

public class Character implements Cloneable{ // Instead of Cloneable any Interface file can be there
    private String name;
    private int health;
    private int attackPower;
    private int level;
    public Character(String name,int health,int attackPower,int level) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.level = level;
    }

    @Override
    public Character clone() throws CloneNotSupportedException{
        // super.clone() do shallow copy which is it copies on higher level
        // It will still be pointing to the original content by reference
        // whereas deep copy maintains everything separate
        // for deep copy we have to perform those steps by us
        return (Character) super.clone();
    }

    public void showCharacterInfo() {
        System.out.println("[Character : " + " name = " + name + ", health = " + health + ", attackPower = " + attackPower + 
            ", level = " + level + "]");
    }
}
