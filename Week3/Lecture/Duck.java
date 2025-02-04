public class Duck extends Waterfowl implements Speaker, Flyer {

    public Duck() {
        super(2, 30);
        this.sound = "quack";
        this.name = "duck";
        // this.wingSpan = 2;
        // this.flyingSpeed = 30;
    }
    public Duck(int wingspan, int flyingSpeed) {
        super(wingspan, flyingSpeed);
    }

    public String toString() {
        return "I am a duck";
    }

}
