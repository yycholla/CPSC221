package Week6.Lecture.Generics;

public class AnimalCage<T extends Animal> extends Cage<T> {

    public AnimalCage(T occupant) {
        super(occupant);
    }

}
