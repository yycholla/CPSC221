public class Rogue extends Characters {

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

    public armorType wearArmor() {
        return armorType.LIGHT;
    }

    public weaponType useWeapon() {
        return weaponType.SIMPLE;
    }

    public boolean hasManeuvers() {
        return false;
    }

    public boolean tendsToRage() {
        return false;
    }

    public boolean sneaksAround() {
        return false;
    }

    public boolean willToSurvive() {
        return false;
    }

    public boolean picksLock() {
        return false;
    }

    public boolean castsSpell() {
        return false;
    }

    public boolean healsOthers() {
        return false;
    }

    public boolean solvesProblems() {
        return false;
    }

    public String toString() {
        return this.soapBox;
    }

}
