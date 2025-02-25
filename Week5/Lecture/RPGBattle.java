import java.util.Random;

public class RPGBattle {
    public static void main(String[] args) throws ExceedsHitPoints {
        int vargusHitPoints = 37;
        System.out.println("Vargus is getting attacked!");
        // try {
            vargusHitPoints = remainingHitPoints(vargusHitPoints);
        // } catch (ExceedsHitPoints exception) {
            // System.out.println(exception.getMessage());
            // vargusHitPoints = 0;
        // }
        System.out.println("Vargus has " + vargusHitPoints + " hp left.");
    }

    private static int remainingHitPoints(int currentHitPoints) throws ExceedsHitPoints {
        Random gen = new Random();
        int damage = gen.nextInt(100) + 1;
        if (damage >= currentHitPoints) {
            throw new ExceedsHitPoints("Vargus is dead!");
        }
        return currentHitPoints - damage;
    }
}
