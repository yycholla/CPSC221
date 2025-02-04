public class Goose extends Waterfowl {
    
    
    public Goose() {
        super(5, 50);
        this.sound = "Honk";
        this.name = "Goose";
        // this.wingSpan = 5;
        // this.flyingSpeed = 50;
    }

    public String Swim() {
        return "I can swim";
    }

    public String toString() {
        return "I am a goose";
    }
}
