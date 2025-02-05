public class Knight extends MartialWeapons {
    private String className;
    private armorType armorType;

    /*
    This doth create, very generously, a stalwart knight.
    Furthermore, as I am a most gracious creator,
    I have allowed thee to play god by granting
    the divine power of variables.
    */
    public Knight(int hitPoints, int armorClass) {
        super(hitPoints, armorClass);
        this.className = "Knight";
        this.armorType = Characters.armorType.HEAVY;
        setHasManeuvers(true);
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
