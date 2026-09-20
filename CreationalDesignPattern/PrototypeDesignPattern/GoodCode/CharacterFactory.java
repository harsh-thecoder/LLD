package CreationalDesignPattern.PrototypeDesignPattern.GoodCode;

public class CharacterFactory {
    private Character prototypeCharacter;

    public CharacterFactory(){
        prototypeCharacter = new Character("DefaultName",100,20,1);
    }

    public Character createCharacterWithNewName(String name) throws CloneNotSupportedException{
        Character clonedCharacter = prototypeCharacter.clone();
        // Only in the case of shallow cloning not required for deep cloning 
        clonedCharacter = new Character(name,clonedCharacter.health,clonedCharacter.attackPower, clonedCharacter.level);
        // clonedCharacter.setName(name);
        return clonedCharacter;
    }

    public Character createCharacterWithNewLevel(int level) throws CloneNotSupportedException{
        Character clonedCharacter = prototypeCharacter.clone();
        // Only in the case of shallow cloning not required for deep cloning 
        clonedCharacter = new Character(clonedCharacter.name,clonedCharacter.health,clonedCharacter.attackPower,level);
        // clonedCharacter.setName(name);
        return clonedCharacter;
    }

    public Character createCharacterWithMoreAttackPower(int attackPower) throws CloneNotSupportedException{
        Character clonedCharacter = prototypeCharacter.clone();
        // Only in the case of shallow cloning not required for deep cloning 
        clonedCharacter = new Character(clonedCharacter.name,clonedCharacter.health,attackPower, clonedCharacter.level);
        // clonedCharacter.setName(name);
        return clonedCharacter;
    }
}
