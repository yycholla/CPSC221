public class Adventure{
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
