package Week2.Lab01;

public class Cleric extends Character {
    // This doth create, very generously, a cleric.
    public Cleric() {
        super("Cleric", "Medium", 14, 17);
    }

    /*
    This doth create, very generously, a cleric.
    Furthermore, as I am a most gracious creator,
    I have allowed thee to play god by granting
    the divine power of variables.
    */
    public Cleric(String typeString, String armorType, int hitPoints, int armorClass) {
        super(typeString, armorType, hitPoints, armorClass);
    }

}
