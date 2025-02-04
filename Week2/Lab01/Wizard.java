public class Wizard extends Characters {
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

    public armorType wearArmor() {
        return armorType.NONE;
    }

    public weaponType useWeapon() {
        return weaponType.STAFF;
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
