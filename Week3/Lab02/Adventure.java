public class Adventure {
    public static void main(String[] args) {

        Character[] characters = new Character[4];

        characters[0] = new Knight();
        characters[1] = new Barbarion();
        characters[2] = new Ranger();
        characters[3] = new Wizard();
        int i = 0;
        do {
            for (Character character : characters) {
                character.toString();
                character.fight();
                System.err.println();
            }

            System.err.println("The Dragon attacks\n");
            characters[0].setWeapon(new NoneBehavior());
            characters[1].takeDamage(100);
            characters[2].takeDamage(50);
            i++;
        } while (i <= 1);

    }
}
