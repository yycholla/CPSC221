public abstract class Characters {
    protected int hitPoints;
    protected int armorClass;
    protected String classType;
    protected String soapBox;
    protected armorType armortype;
    protected weaponType weaponType;

    protected enum armorType {
        HEAVY, MEDIUM, LIGHT, NONE, NULL
    }

    protected enum weaponType {
        MARTIAL, SIMPLE, STAFF, NULL
    }

    public Characters(String typeString, armorType armorType, weaponType weaponType, int hitPoints, int armorClass) {
        this.soapBox = "I am a Frenchman.\n I cough in your general direction! \n Now go away before I taunt you a second time!";
        this.hitPoints = hitPoints;
        this.armorClass = armorClass;
        this.classType = typeString;
        this.armortype = wearArmor();
        this.weaponType = useWeapon();

    }

    public armorType wearArmor() {
        return armorType.NULL;
    }

    public weaponType useWeapon() {
        return weaponType.NULL;
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
