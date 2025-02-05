public abstract class SimpleWeapons extends Characters{

    public SimpleWeapons(int hitPoints, int armorClass) {
        super(hitPoints, armorClass);
    }

    public Characters.weaponType useWeapon() {
        return weaponType.SIMPLE;
    }

}
