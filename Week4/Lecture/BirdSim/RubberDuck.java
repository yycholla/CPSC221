package Week4.Lecture.BirdSim;

public class RubberDuck extends Duck  {
    public RubberDuck() {
        super(new Squeek(), new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("Looks like a rubber duck.");
    }
}
