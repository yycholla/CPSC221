public class Barbarian extends Characters {

    public Barbarian() {
        super("Barbarian", armorType.MEDIUM, weaponType.MARTIAL, 21, 13);
    }

    /*
     * This doth create, very generously, a mighty barbarian.
     * Furthermore, as I am a most gracious creator,
     * I have allowed thee to play god by granting
     * the divine power of variables. Do not bother
     * trying to explain variables to them.
     */
    public Barbarian(String typeString, armorType armorType, weaponType weaponType, int hitPoints, int armorClass) {
        super(typeString, armorType, weaponType, hitPoints, armorClass);
    }

    public armorType wearArmor() {
        return armorType.MEDIUM;
    }

    public weaponType useWeapon() {
        return weaponType.MARTIAL;
    }

    public boolean tendsToRage() {
        return true;
    }

    public String toString() {
        return this.soapBox;
    }

}
