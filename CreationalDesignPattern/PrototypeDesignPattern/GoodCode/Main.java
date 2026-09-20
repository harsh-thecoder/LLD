package CreationalDesignPattern.PrototypeDesignPattern.GoodCode;

/*
    When almost everything remains same and just few things have to be changed for multiple objects
    In those cases we use Prototype Design Pattern
*/
public class Main {
    public static void main(String args[]){
        CharacterFactory characterFactory = new CharacterFactory();
        Character characterWithNewName = characterFactory.createCharacterWithNewName("Harsh");
        characterWithNewName.showCharacterInfo();
        Character characterWithNewLevel = characterFactory.createCharacterWithNewLevel(10);
        characterWithNewLevel.showCharacterInfo();
        Character characterWithMoreAttackPower = characterFactory.createCharacterWithMoreAttackPower(500);
        characterWithMoreAttackPower.showCharacterInfo();
    }
}
