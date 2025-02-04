package Week2.Lab01;

public abstract class Character {
    private int hitPoints, armorClass;
    private String classType, soapBox, cliche, armorType;


    public Character(String typeString, String armorType, int hitPoints, int armorClass) {
        this.soapBox = "I am a Frenchman.\n I cough in your general direction! \n Now go away before I taunt you a second time!";
        this.hitPoints = hitPoints;
        this.armorClass = armorClass;
        this.classType = typeString;
        this.armorType = armorType;
    }

    public String wearArmor() {
        return "";
    }

    public String useWeapon() {
        return "";
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
