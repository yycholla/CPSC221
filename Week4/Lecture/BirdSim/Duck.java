package Week4.Lecture.BirdSim;

public abstract class Duck {

    private QuackBehavior quackBehavior;
    private FlyBehavior fly;

    protected Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.fly = flyBehavior;
    }

    public void swim() {
        System.out.println("Float and paddle on the water.");
    }

    public abstract void display();

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void performFly() {
        this.fly.fly();
    }

    public void setQuackBehavior(QuackBehavior quack) {
        this.quackBehavior = quack;
    }

    public void setFlyBehavior(FlyBehavior fly) {
        this.fly = fly;
    }
}
