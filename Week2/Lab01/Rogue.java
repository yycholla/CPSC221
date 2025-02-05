public class Rogue extends MartialWeapons {

    /**
     * Constructor for the Rogue class.
     *
     * @param hitPoints  The hit points of the character.
     * @param armorClass The armor class of the character.
     */
    public Rogue(int hitPoints, int armorClass) {
        super(hitPoints, armorClass);
        setSneaksAround(true);
        setPicksLock(true);
        updateDescription();
    }

    /**
     * Returns the name of the character class.
     *
     * @return The name of the character as a String.
     */

    @Override
    public String className() {
        return "Rogue";
    }

    /**
     * Rogues wear light armor.
     *
     * @return The type of armor the Rogue wears.
     */
    @Override
    public Characters.armorType wearArmor() {
        return Characters.armorType.LIGHT;
    }

}
