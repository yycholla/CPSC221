package Week6.Lecture.Generics;

public class CageThemAll {
    public static void main(String[] args) {
        Cage<Canary> canaryCage = new Cage<Canary>(new Canary());

        System.out.println("Who's in the canary cage!" + canaryCage.toString());
        canaryCage.examineCage().sing();

        Cage<Hawk> hawkCage = new Cage<Hawk>(new Hawk());

        System.out.println("Who's in the hawk cage?: " + hawkCage.toString());
        hawkCage.examineCage().hunt();

        Cage<Rat> ratCage = new Cage<Rat>(new Rat());

        System.out.println("Who's in the hawk cage?: " + hawkCage.toString());
        ratCage.examineCage().explore();

        Cage<Adventurer> dungeonCage = new Cage<Adventurer>(new Adventurer());
        System.out.println("Who's in the cage?: " + dungeonCage.toString());
        dungeonCage.examineCage().goalInLife();
    }
}
