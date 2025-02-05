public class Cleric extends SimpleWeapons {

    /**
     * Constructor for the Cleric class.
     *
     * @param hitPoints The hit points of the character.
     * @param armorClass The armor class of the character.
     */
    public Cleric(int hitPoints, int armorClass) {
        super( hitPoints, armorClass);


        setHealsOthers(true);
        setCastsSpell(true);
        updateDescription();
    }

    /**
     * Clerics wear medium armor.
     *
     * @return The type of armor that the cleric wears.
     */
    @Override
    public Characters.armorType wearArmor() {
        return Characters.armorType.MEDIUM;
    }

    /**
     * Returns the name of the character.
     *
     * @return The name of the character.
     */
    @Override
    public String className() {
        return "Cleric";
    }

}
