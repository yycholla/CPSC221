package Week6.Lecture.Generics;

public class Cage {
    private Object occupant;

    public Cage(Object occupant) {
        this.occupant = occupant;
    }

    public Object examineCage() {
        return this.occupant;
    }

    public void swapInCage(Object occupant) {
        this.occupant = occupant;
    }

    public String toString() {
        return this.occupant.toString();
    }
}
