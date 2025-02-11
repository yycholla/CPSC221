package Week4.Lecture.BirdSim;

public class DuckSim {
    public static void main(String[] args) {
        Duck[] ducks = new Duck[6];

        ducks[0] = new MallardDuck();
        ducks[1] = new RedheadDuck();
        ducks[2] = new CanvasbackDuck();
        ducks[3] = new RubberDuck();
        ducks[4] = new DecoyDuck();
        ducks[5] = new PintailDuck();

        for (Duck duck : ducks) {
            duck.performQuack();
            duck.swim();
            duck.display();
            duck.performFly();
            System.out.println("");
        }

        ducks[0].setFlyBehavior(new FlyNoWay());
        ducks[0].setQuackBehavior(new Mute());

        ducks[0].performQuack();
        ducks[0].swim();
        ducks[0].display();
        ducks[0].performFly();
    }
}
