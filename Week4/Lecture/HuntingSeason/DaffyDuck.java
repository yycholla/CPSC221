package Week4.Lecture.HuntingSeason;

public class DaffyDuck implements Observer, DisplayAttitude {
    private final String DEFAULT_ATTITUDE;
    private String attitude;
    private Subject fishAndGame;

    public DaffyDuck(Subject fishAndGame) {
        this.attitude = DEFAULT_ATTITUDE = "Hmmmmmm. I wonder why it's quiet.";
        fishAndGame.registerObserver(this);
        this.fishAndGame = fishAndGame;
    }

    @Override
    public void update(HuntingSeason season) {

        switch (season) {
            case DUCK:
                this.attitude = "You're despicable! It is really \"Rabbit Season\".";
                break;
            case RABBIT:
                this.attitude = "Not very sporting for bugs but at least it's not \"Duck Season\".";
                break;
            default:
                attitude = DEFAULT_ATTITUDE;
                break;
        }
    }

    public void display() {
        System.out.println(this);
        System.out.println(attitude);
    }

    public void getMeOuttaHere() {
        fishAndGame.removeObserver(this);
    }

    public String toString() {
        return "My name is Daffy Duck.";
    }
}
