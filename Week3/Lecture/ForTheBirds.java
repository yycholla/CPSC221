public class ForTheBirds {
    public static void main(String[] args) {
        Hawk hawk = new Hawk();
        Duck duck = new Duck();
        Parrot parrot = new Parrot();
        Goose goose = new Goose();
        RubberDuck rubberDuck = new RubberDuck();

        System.out.println("\n" + duck);
        duck.eat();
        duck.fly();
        duck.speak();
        duck.swim();
        duck.toString();

        duck = new RubberDuck();

        System.out.println("\n" + duck);
        duck.eat();
        duck.fly();
        duck.speak();
        duck.swim();
        duck.toString();

        Waterfowl waterfowl = new RubberDuck();
        System.out.println("\n" + waterfowl);
        waterfowl.eat();
        waterfowl.fly();
        waterfowl.speak();
        waterfowl.swim();
        waterfowl.toString();

        Bird bird = new RubberDuck();
        System.out.println("\n" + bird);
        bird.eat();
        bird.fly();
        bird.speak();
        ((RubberDuck) bird).swim();
        bird.toString();

        Object object = new RubberDuck();
        System.out.println("\n" + object);
        ((RubberDuck) object).eat();
        ((RubberDuck) object).fly();
        ((RubberDuck) object).speak();
        ((RubberDuck) object).swim();
        object.toString();

        //#############################################################################
        // NOTE: Create array of birds through polymorphism so we can loop through them
        Bird[] menagerie = new Bird[6];
        menagerie[0] = new Hawk();
        menagerie[1] = new Duck();
        menagerie[2] = new Parrot();
        menagerie[3] = new Hummingbird();
        menagerie[4] = new Goose();
        menagerie[5] = new RubberDuck();

        for (Bird bird2 : menagerie) {
            System.out.println("\n" + bird2);
            bird2.eat();
            bird2.fly();
            bird2.speak();
            bird2.toString();
            if (bird2 instanceof Hawk) {
                ((Hawk) bird2).hunt();
            }
            if (bird2 instanceof Waterfowl) {
                ((Waterfowl) bird2).swim();
            }
            if (bird2 instanceof RubberDuck) {
                ((RubberDuck) bird2).play();
            }
        }
        //#############################################################################

        // System.out.println(hawk);
        // hawk.eat();
        // hawk.fly();
        // hawk.speak();
        // hawk.hunt();
        // hawk.toString();


        // System.out.println("\n" + parrot);
        // parrot.eat();
        // parrot.fly();
        // parrot.speak();
        // parrot.toString();

        // System.out.println("\n" + goose);
        // goose.eat();
        // goose.fly();
        // goose.speak();
        // goose.swim();
        // goose.toString();

        // rubberDuck.eat();
        // rubberDuck.fly();
        // rubberDuck.speak();
        // rubberDuck.swim();
        // rubberDuck.toString();
        // rubberDuck.play();


    }
}
