package Week4.Lecture.HuntingSeason;

public class LooneyTunes {
    public static void main(String[] args) {
        IdahoFishAndGame fishAndGame = new IdahoFishAndGame();
        DisplayAttitude[] actors = new DisplayAttitude[3];

        actors[0] = new ElmerFudd(fishAndGame);
        actors[1] = new BugsBunny(fishAndGame);
        actors[2] = new DaffyDuck(fishAndGame);

        System.out.println("\n--- Beginning of Argument:");
        for (DisplayAttitude actor : actors) {
            actor.display();
            System.out.println();

        }

        System.out.println("\n--- Rabbit Season ---");
        fishAndGame.setHuntingSeason(HuntingSeason.RABBIT);
        for (DisplayAttitude actor : actors) {
            actor.display();
            System.out.println();
        }

        System.out.println("\n--- Duck Season ---");
        fishAndGame.setHuntingSeason(HuntingSeason.DUCK);
        for (DisplayAttitude actor : actors) {
            actor.display();
            System.out.println();

        }

        System.out.println("\n--- Neither Season ---");
        fishAndGame.setHuntingSeason(HuntingSeason.NEITHER);
        for (DisplayAttitude actor : actors) {
            actor.display();
            System.out.println();
        }
        ((DaffyDuck)actors[2]).getMeOuttaHere();

        System.out.println("\n--- Duck Season ---");
        fishAndGame.setHuntingSeason(HuntingSeason.DUCK);
        for (DisplayAttitude actor : actors) {
            actor.display();
            System.out.println();

        }
    }
}
