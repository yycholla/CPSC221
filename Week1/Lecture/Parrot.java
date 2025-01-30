public class Parrot extends Bird {
    public Parrot() {
        super(4, 25);
        this.sound = "Poly want a cracker.";
        this.name = "Parrot";
        // this.wingSpan = 4;
        // this.flyingSpeed = 25;
    }

    public String toString() {
        return "I am a parrot";
    }
}
