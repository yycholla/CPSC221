public class Wizard extends Character {
    private static WeaponBehavior initialWeapon = new MagicStaffBehavior();

    public Wizard() {
        super(9, 10, initialWeapon);
    }

    @Override
    public String toString() {
        return "Mysterious, arcane wizard";
    }

}
