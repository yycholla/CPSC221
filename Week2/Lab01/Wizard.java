public class Wizard extends MagicWeapons {
    private String className;
    private armorType armorType;
    /*
    This doth create, very generously, a wise wizard.
    Furthermore, as I am a most gracious creator,
    I have allowed thee to play god by granting
    the divine power of variables.
    */

    public Wizard(int hitPoints, int armorClass) {
        super(hitPoints, armorClass);
        this.className = "Wizard";
        this.armorType = Characters.armorType.NONE;
        setCastsSpell(true);
        setSolvesProblems(true);
    }

    @Override
    public String className() {
        return this.className;
    }

    @Override
    public Characters.armorType wearArmor() {
        return this.armorType;
    }
}
