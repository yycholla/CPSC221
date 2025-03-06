package Week6.Lecture.Generics;

public class CageForHawk {
    private Hawk occupant;

    public CageForHawk(Hawk occupant) {
        this.occupant = occupant;
    }

    public Hawk examineCage() {
        return this.occupant;
    }

    public void swapInCage(Hawk occupant) {
        this.occupant = occupant;
    }

    public String toString() {
        return this.occupant.toString();
    }
}
