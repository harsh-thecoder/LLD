package CreationalDesignPattern.PrototypeDesignPattern.BadCode;

public class CharacterFactory {
    public Character createCharacterWithNewName(String name){
        return new Character(name, 100,50,1);
    }

    public Character createCharacterWithNewLevel(int level){
        return new Character("DefaultName", 100, 50, level);    
    }

    public Character createCharacterWithMoreAttackPower(int attackPower){
        return new Character("DefaultName", 100, attackPower, 2);
    }
}
