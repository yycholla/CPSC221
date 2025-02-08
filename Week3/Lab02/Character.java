public abstract class Character {
    private int hitPoints, armorClass;
    private WeaponBehavior weapon;

    public Character(int initialHitPoints, int armorClass, WeaponBehavior initialWeapon) {
        this.hitPoints = initialHitPoints;
        this.armorClass = armorClass;
        setWeapon(initialWeapon);

    }

    public void fight() {
        if (hitPoints > 0) {
            weapon.useWeapon();
        } else {
            System.err.println("Is down for the count.");
        }
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public WeaponBehavior getWeapon() {
        WeaponBehavior copy = this.weapon;
        return copy;
    }

    public int getHitPoints() {
        int copy = this.hitPoints;
        return copy;
    }

    public int getArmorClass() {
        int copy = this.armorClass;
        return copy;
    }

    public void takeDamage(int damage) {
        this.hitPoints -= damage;
    }

    public abstract String toString();

}
