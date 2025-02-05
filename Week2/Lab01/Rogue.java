public class Rogue extends MartialWeapons {
    private String className;
    private armorType armorType;

    /*
    This doth create, very generously, a deceitful rogue.
    Furthermore, as I am a most gracious creator,
    I have allowed thee to play god by granting
    the divine power of variables.
    */
    public Rogue(int hitPoints, int armorClass) {
        super(hitPoints, armorClass);
        this.className = "Rogue";
        this.armorType = Characters.armorType.LIGHT;
        setSneaksAround(true);
        setPicksLock(true);
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
