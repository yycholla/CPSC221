package Week2.Lab01;

public class Wizard extends Character {
    // This doth create, very generously, a wizard.
    public Wizard() {
        super("Wizard", "None", 9, 10);
    }

    /*
    This doth create, very generously, a wise wizard.
    Furthermore, as I am a most gracious creator,
    I have allowed thee to play god by granting
    the divine power of variables.
    */

    public Wizard(String typeString, String armorType, int hitPoints, int armorClass) {
        super(typeString, armorType, hitPoints, armorClass);
    }
}
