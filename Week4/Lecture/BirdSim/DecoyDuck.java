package Week4.Lecture.BirdSim;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new Mute(), new FlyNoWay());
    }
    public void display() {
        System.out.println("Looks like a duck?");
    }

    public void swim() {
        System.out.println("Float and bob on the water");
    }

}
