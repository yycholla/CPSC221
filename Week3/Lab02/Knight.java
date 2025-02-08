public class Knight extends Character {
    private static WeaponBehavior initialWeapon = new SwordBehavior();

    public Knight() {
        super(17, 17, initialWeapon);
    }

    @Override
    public String toString() {
        return "Knight in shining armor.";
    }

}
