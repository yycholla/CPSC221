public class Adventure{
/**
 * The main method serves as the entry point of the Adventure application.
 * It creates instances of various character classes such as Knight, Barbarian,
 * Ranger, Rogue, Cleric, and Wizard with their respective hit points and armor
 * class values. The method then prints out the string representation of each
 * character to the console.
 *
 * @param args Command line arguments (not used in this application).
 */

    public static void main(String[] args) {
        Knight knight = new Knight(17, 17);
        Barbarian barbarian = new Barbarian(21, 13);
        Ranger ranger = new Ranger(13, 15);
        Rogue rogue = new Rogue(11, 16);
        Cleric cleric = new Cleric(14, 17);
        Wizard wizard = new Wizard(9, 10);

        System.out.println(knight.toString());
        System.out.println(barbarian.toString());
        System.out.println(ranger.toString());
        System.out.println(rogue.toString());
        System.out.println(cleric.toString());
        System.out.println(wizard.toString());

    }

}
