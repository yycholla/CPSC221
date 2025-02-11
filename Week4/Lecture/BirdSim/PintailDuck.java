package Week4.Lecture.BirdSim;

public class PintailDuck extends Duck {

    protected PintailDuck() {
            super(new Quack(), new FlyWithWings());
        }

        @Override
    public void display() {
        System.out.println("Looks like a pintail duck.");
    }

}
