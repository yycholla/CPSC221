package Week4.Lecture.BirdSim;

public class CanvasbackDuck extends Duck {
    public CanvasbackDuck() {
        super(new Quack(), new FlyWithWings());
    }
    @Override
    public void display() {
        System.out.println("Looks like a canvasback duck.");
    }
}
