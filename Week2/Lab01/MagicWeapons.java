public abstract class MagicWeapons extends Characters{

    public MagicWeapons(int hitPoints, int armorClass) {
        super(hitPoints, armorClass);
    }

    public Characters.weaponType useWeapon() {
        return weaponType.STAFF;
    }

}
