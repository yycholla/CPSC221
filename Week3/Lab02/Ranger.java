public class Ranger extends Character {
    private static WeaponBehavior initialWeapon = new BowAndArrowBehavior();

    public Ranger() {
        super(13, 15, initialWeapon);
    }

    @Override
    public String toString() {
        return "Quick, stealthy ranger.";
    }

}
