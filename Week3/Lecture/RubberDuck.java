public class RubberDuck extends Duck {
    public RubberDuck() {
        super(0, 0);
        this.sound = "Squeek squeek";
        this.name = "RubberDuck";
    }

    public void play() {
        System.out.println("I am a toy, Squeeze me!");
    }

    public String toString() {
        return "I am a rubber duck";
    }
}
