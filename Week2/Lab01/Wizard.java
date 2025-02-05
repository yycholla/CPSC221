public class Wizard extends MagicWeapons {

    /**
     * Constructor for the Wizard class.
     *
     * @param hitPoints The hit points of the character.
     * @param armorClass The armor class of the character.
     */
    public Wizard(int hitPoints, int armorClass) {
        super(hitPoints, armorClass);
        setCastsSpell(true);
        setSolvesProblems(true);
        updateDescription();
    }


    /**
     * Returns the name of the character class.
     *
     * @return The name of the character class.
     */

    @Override
    public String className() {
        return "Wizard";
    }


    /**
     * Wizards wear no armor.
     *
     * @return The type of armor the character wears.
     */
    @Override

    public Characters.armorType wearArmor() {
        return Characters.armorType.NONE;
    }
}
