public class Barbarion extends Character {

    private static WeaponBehavior initialWeapon = new AxeBehavior();

    public Barbarion() {
        super(21, 13, initialWeapon);
    }

    @Override
    public String toString() {
        return "Fur-clad raging barbarian.";
    }

}
