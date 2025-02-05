public class Knight extends MartialWeapons {
    /**
     * Constructor for the Knight class.
     *
     * @param hitPoints The hit points of the character.
     * @param armorClass The armor class of the character.
     */
    public Knight(int hitPoints, int armorClass) {
        super(hitPoints, armorClass);
        setHasManeuvers(true);
        updateDescription();

    }

    /**
     * Knights wear heavy armor.
     *
     * @return The type of armor the knight wears.
     */
    @Override
    public Characters.armorType wearArmor() {
        return Characters.armorType.HEAVY;
    }

    /**
     * Returns the name of the character.
     *
     * This method is abstract and must be implemented by the subclass.
     *
     * @return The name of the character.
     */
    @Override
    public String className() {
        return "Knight";
    }
}
