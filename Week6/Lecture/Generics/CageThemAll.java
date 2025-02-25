package Week6.Lecture.Generics;

public class CageThemAll {
    public static void main(String[] args) {
        Cage canaryCage = new Cage(new Canary());

        System.out.println("Who's in the canary cage!" + canaryCage.toString());
        ((Canary)canaryCage.examineCage()).sing();

        Cage hawkCage = new Cage(new Hawk());

        System.out.println("Who's in the hawk cage?: " + hawkCage.toString());
        ((Hawk)hawkCage.examineCage()).hunt();

        Cage ratCage = new Cage(new Rat());

        System.out.println("Who's in the hawk cage?: " + hawkCage.toString());
        ((Rat)ratCage.examineCage()).explore();

        Cage dungeonCage = new Cage(new Adventurer());
        System.out.println("Who's in the cage?: " + dungeonCage.toString());
        ((Adventurer)dungeonCage.examineCage()).goalInLife();
    }
}
