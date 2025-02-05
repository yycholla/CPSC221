public abstract class MartialWeapons extends Characters {

        public MartialWeapons(int hitPoints, int armorClass) {
            super(hitPoints, armorClass);
    }

    public Characters.weaponType useWeapon() {
        return weaponType.MARTIAL;
    }

}
