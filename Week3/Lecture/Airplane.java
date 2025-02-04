public class Airplane implements Flyer {

    @Override
    public void fly() {
        System.out.println("I am flying on jet fuel!!!");
    }

    public String toString() {
        return "I am a airplane, whoosh!";
    }

}
