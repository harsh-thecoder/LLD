package CreationalDesignPattern.PrototypeDesignPattern.BadCode;

public class Main {
    public static void main(String args[]){
        CharacterFactory charactersFactory = new CharacterFactory();
        Character characterWithNewName = charactersFactory.createCharacterWithNewName("Harsh");
        characterWithNewName.showCharacterInfo();
        Character characterWithNewLevel = charactersFactory.createCharacterWithNewLevel(10);
        characterWithNewLevel.showCharacterInfo();
        Character characterWithMoreAttackPower = charactersFactory.createCharacterWithMoreAttackPower(500);
        characterWithMoreAttackPower.showCharacterInfo();
    }
}
