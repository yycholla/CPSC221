package Week6.Lecture.Generics;

public class Hawk extends Bird {

    @Override
    public void speak() {
        System.out.println("Skrreeeeee!!!!");
    }

    @Override
    public void eat() {
        System.out.println("I eat meat");
    }

    public void hunt() {
        System.out.println("I hunt other birds.");
    }

    public String toString() {
        return "I am a hawk";
    }

}
