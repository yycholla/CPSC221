public class Ranger extends MartialWeapons {
    private armorType armorType;

    /**
     * Constructor for the Ranger class.
     *
     * @param hitPoints The hit points of the character.
     * @param armorClass The armor class of the character.
     */
    public Ranger(int hitPoints, int armorClass) {
        super(hitPoints, armorClass);
        setWillToSurvive(true);
        setSneaksAround(true);
        updateDescription();
    }




    /**
     * Returns the name of the character.
     *
     * @return The name of the character.
     */
    @Override
    public String className() {
        return "Ranger";
    }


    /**
     * Rangers wear medium armor.
     *
     * @return The type of armor the Ranger wears.
     */
    @Override
    public Characters.armorType wearArmor() {
        return Characters.armorType.MEDIUM;
    }



}
