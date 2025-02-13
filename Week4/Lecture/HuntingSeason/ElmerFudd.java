package Week4.Lecture.HuntingSeason;


public class ElmerFudd implements Observer, DisplayAttitude {
    private final String DEFAULT_ATTITUDE;
    private String attitude;

    public ElmerFudd(Subject fishAndGame) {
        this.attitude = DEFAULT_ATTITUDE = "I am wewaxing in my chaiw by the fiwe. Heh eh eh eh eh.";
        fishAndGame.registerObserver(this);
    }

    @Override
    public void update(HuntingSeason season) {

        switch (season) {
            case DUCK:
                this.attitude = "Be wewy, wewy quiet. I'm hunting ducks. Heh eh eh eh eh.";
                break;
            case RABBIT:
                this.attitude = "Be wewy, wewy quiet. I'm hunting wabbits. Heh eh eh eh eh.";
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
        return "My name is Elmew Fudd.";
    }

}
