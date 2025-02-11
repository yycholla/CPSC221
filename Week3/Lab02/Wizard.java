public class Wizard extends Character {

    public Wizard() {
        super(9, 10, new MagicStaffBehavior());
    }

    @Override
    public String toString() {
        return "Mysterious, arcane wizard";
    }

}
