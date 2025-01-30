public class Bird {

    protected double wingSpan;
    protected double flyingSpeed;
    protected String sound = "Please insert sound";
    protected String name;

    public Bird(double wingSpan, double flyingSpeed) {
        this.wingSpan = wingSpan;
        this.flyingSpeed = flyingSpeed;
    }

    public void eat() {
        System.out.println("I eat");
    }

    public void fly() {
        System.out.println("I fly " + flyingSpeed + "mph with my " + wingSpan + "ft wingspan");
    }

    public void speak() {
        System.out.println("I " + sound);
    }

    public String toString() {
        return "I am a " + name + " with a " + wingSpan + "ft wingspan and a flying speed of " + flyingSpeed + "mph.";
    }
}
