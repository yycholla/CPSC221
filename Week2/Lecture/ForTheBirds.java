public class ForTheBirds {
    public static void main(String[] args) {
        Hawk hawk = new Hawk();
        Duck duck = new Duck();
        Parrot parrot = new Parrot();
        Goose goose = new Goose();
        RubberDuck rubberDuck = new RubberDuck();

        System.out.println(hawk);
        hawk.eat();
        hawk.fly();
        hawk.speak();
        hawk.hunt();
        hawk.toString();

        System.out.println("\n" + duck);
        duck.eat();
        duck.fly();
        duck.speak();
        duck.swim();
        duck.toString();

        System.out.println("\n" + parrot);
        parrot.eat();
        parrot.fly();
        parrot.speak();
        parrot.toString();

        System.out.println("\n" + goose);
        goose.eat();
        goose.fly();
        goose.speak();
        goose.swim();
        goose.toString();

        rubberDuck.eat();
        rubberDuck.fly();
        rubberDuck.speak();
        rubberDuck.swim();
        rubberDuck.toString();


    }
}
