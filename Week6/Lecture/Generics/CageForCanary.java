package Week6.Lecture.Generics;

public class CageForCanary {
    private Canary occupant;

    public CageForCanary(Canary occupant) {
        this.occupant = occupant;
    }

    public Canary examineCage() {
        return this.occupant;
    }

    public void swapInCage(Canary occupant) {
        this.occupant = occupant;
    }

    public String toString() {
        return this.occupant.toString();
    }
}
