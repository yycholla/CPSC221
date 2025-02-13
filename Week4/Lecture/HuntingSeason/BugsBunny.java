package Week4.Lecture.HuntingSeason;

public class BugsBunny implements Observer, DisplayAttitude {
    private final String DEFAULT_ATTITUDE;
    private String attitude;

    public BugsBunny(Subject fishAndGame) {
        this.attitude = DEFAULT_ATTITUDE = "Ehhh.... What's up doc?";
        fishAndGame.registerObserver(this);
    }

    @Override
    public void update(HuntingSeason season) {

        switch (season) {
            case DUCK:
                this.attitude = "Guess my signs worked. Ain't I a stinker?.";
                break;
            case RABBIT:
                this.attitude = "I better get those \"duck Season \" signs up.";
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

    public String toString() {
        return "My name is Bugs Bunny..";
    }

}
