public class Knight extends Character {

    public Knight() {
        super(17, 17, new SwordBehavior());
    }

    @Override
    public String toString() {
        return "Knight in shining armor.";
    }

}
