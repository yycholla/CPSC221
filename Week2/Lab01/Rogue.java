package Week2.Lab01;

public class Rogue extends Character {

    public Rogue() {
        super("Rogue", "Light", 11, 16);
    }

    /*
    This doth create, very generously, a deceitful rogue.
    Furthermore, as I am a most gracious creator,
    I have allowed thee to play god by granting
    the divine power of variables.
    */
    public Rogue(String typeString, String armorType, int hitPoints, int armorClass) {
        super(typeString, armorType, hitPoints, armorClass);
    }

}
