package CreationalDesignPattern.PrototypeDesignPattern.BadCode;

public class Character {
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

    public void showCharacterInfo() {
        System.out.println("[Character : " + " name = " + name + ", health = " + health + ", attackPower = " + attackPower + 
            ", level = " + level + "]");
    }
}
