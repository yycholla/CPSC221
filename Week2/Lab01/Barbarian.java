package Week2.Lab01;

public class Barbarian extends Character{

    public Barbarian() {
        super("Barbarian", "Medium", 21, 13);
    }

    public Barbarian(String typeString, String armorType, int hitPoints, int armorClass) {
        super(typeString, armorType, hitPoints, armorClass);
    }

}
