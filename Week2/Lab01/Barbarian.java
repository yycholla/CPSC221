public class Barbarian extends MartialWeapons {
    private String className;
    private armorType armorType;
    /*
     * This doth create, very generously, a mighty barbarian.
     * Furthermore, as I am a most gracious creator,
     * I have allowed thee to play god by granting
     * the divine power of variables. Do not bother
     * trying to explain variables to them.
     */
    public Barbarian(int hitPoints, int armorClass) {
        super(hitPoints, armorClass);
        this.className = "Barbarian";
        this.armorType = Characters.armorType.MEDIUM;
        setTendsToRage(true);
    }

    @Override
    public String className() {
        return this.className;
    }

    public armorType wearArmor() {
        return this.armorType;
    }



}
