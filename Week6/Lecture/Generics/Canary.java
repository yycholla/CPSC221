package Week6.Lecture.Generics;

public class Canary extends Bird {

    @Override
    public void speak() {
        System.out.println("Tweet tweet");
    }

    @Override
    public void eat() {
        System.out.println("I eat bird seed");
    }

    public void sing() {
        System.out.println("I like to sing");
    }

    public String toString() {
        return "I am a canary.";
    }

}
