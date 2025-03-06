package Week6.Lecture.Generics;

public class Rat implements Animal{
    public void eat() {
        System.out.println("I eat everything.");
    }

    public void speak() {
        System.out.println("Squeek");
    }

    public void explore() {
        System.out.println("I like to get into everything.");
    }

    public String toString() {
        return "I am a rat.";
    }
}
