public class Cleric extends SimpleWeapons {
    private String className;
    private armorType armorType;
    // This doth create, very generously, a cleric.
    /*
    This doth create, very generously, a devout cleric.
    Furthermore, as I am a most gracious creator,
    I have allowed thee to play god by granting
    the divine power of variables.
    */
    public Cleric(int hitPoints, int armorClass) {
        super( hitPoints, armorClass);
        this.className = "Cleric";
        this.armorType = Characters.armorType.MEDIUM;
        setHealsOthers(true);
        setCastsSpell(true);
    }

    @Override
    public Characters.armorType wearArmor() {
        return this.armorType;
    }

    @Override
    public String className() {
        return this.className;
    }
}
