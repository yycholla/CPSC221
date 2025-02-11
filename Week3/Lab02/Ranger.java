public class Ranger extends Character {

    public Ranger() {
        super(13, 15, new BowAndArrowBehavior());
    }

    @Override
    public String toString() {
        return "Quick, stealthy ranger.";
    }

}
