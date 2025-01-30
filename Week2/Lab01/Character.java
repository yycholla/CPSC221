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

    public String toString() {
        return this.soapBox;
    }
}
