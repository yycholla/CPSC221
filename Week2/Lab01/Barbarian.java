public class Barbarian extends MartialWeapons {

    /**
     * Constructor for the Barbarian class.
     *
     * @param hitPoints The hit points of the character.
     * @param armorClass The armor class of the character.
     */
    public Barbarian(int hitPoints, int armorClass) {
        super(hitPoints, armorClass);
        setTendsToRage(true);
        updateDescription();
    }



/**
 * Returns the name of the character class.
 *
 * @return The name "Barbarian" representing the character class.
 */

    @Override
    public String className() {
        return "Barbarian";
    }


/**
 * Barbarians wear medium armor.
 *
 * @return The type of armor that the barbarian wears.
 */

    @Override
    public Characters.armorType wearArmor() {
        return Characters.armorType.MEDIUM;
    }




}
