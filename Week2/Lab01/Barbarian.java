package Week2.Lab01;

public class Barbarian extends Character{

    public Barbarian() {
        super("Barbarian", "Medium", 21, 13);
    }

    /*
    This doth create, very generously, a mighty barbarian.
    Furthermore, as I am a most gracious creator,
    I have allowed thee to play god by granting
    the divine power of variables. Do not bother
    trying to explain variables to them.
    */
    public Barbarian(String typeString, String armorType, int hitPoints, int armorClass) {
        super(typeString, armorType, hitPoints, armorClass);
    }

}
