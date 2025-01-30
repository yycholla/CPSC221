public class Duck extends Waterfowl {

    public Duck() {
        super(2, 30);
        this.sound = "quack";
        this.name = "duck";
        // this.wingSpan = 2;
        // this.flyingSpeed = 30;
    }

    public String toString() {
        return "I am a duck";
    }

}