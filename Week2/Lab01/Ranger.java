public class Ranger extends MartialWeapons {
    private String className;
    private armorType armorType;

    /*
    This doth create, very generously, a rugged ranger.
    Furthermore, as I am a most gracious creator,
    I have allowed thee to play god by granting
    the divine power of variables.
    */
    public Ranger(int hitPoints, int armorClass) {
        super(hitPoints, armorClass);
        this.className = "Ranger";
        setWillToSurvive(true);
        setSneaksAround(true);
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
