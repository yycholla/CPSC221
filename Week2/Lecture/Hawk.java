public class Hawk extends Bird {

    

    public Hawk() {
        super(4, 120);
        this.sound = "Skreee";
        this.name = "Hawk";
        // this.wingSpan = 4;
        // this.flyingSpeed = 120;
    }

    public String toString() {
        return "I am a hawk";
    }

    public void hunt() {
        System.out.println("I hunt other birds.");
    }
}
