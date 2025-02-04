package Week2.Lab01;

public class Ranger extends Character{

    public Ranger() {
        super("Ranger", "Medium", 13, 15);
    }

    /*
    This doth create, very generously, a rugged ranger.
    Furthermore, as I am a most gracious creator,
    I have allowed thee to play god by granting
    the divine power of variables.
    */
    public Ranger(String typeString, String armorType, int hitPoints, int armorClass) {
        super(typeString, armorType, hitPoints, armorClass);
    }

}
