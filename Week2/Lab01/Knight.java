package Week2.Lab01;

public class Knight extends Character {

    public Knight() {
        super("Knight", "Heavy", 17, 17);
    }

    /*
    This doth create, very generously, a stalwart knight.
    Furthermore, as I am a most gracious creator,
    I have allowed thee to play god by granting
    the divine power of variables.
    */
    public Knight(String typeString, String armorType, int hitPoints, int armorClass) {
        super(typeString, armorType, hitPoints, armorClass);
    }

}
