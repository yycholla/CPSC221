public abstract class SimpleWeapons extends Characters{

    /**
     * Constructor for the SimpleWeapons class.
     * Used as a passthrough to the Characters constructor.
     *
     * @param hitPoints The hit points of the character.
     * @param armorClass The armor class of the character.
     */
    public SimpleWeapons(int hitPoints, int armorClass) {
        super(hitPoints, armorClass);
    }


    /**
     * Defines the weapon type of child classes.
     *
     * @return The weapon type, which is SIMPLE.
     */
    public Characters.weaponType useWeapon() {
        return weaponType.SIMPLE;
    }


}
