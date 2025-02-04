public class Teacher implements Speaker{

    @Override
    public void speak() {
        System.out.println("JAVA!!!!");
    }

    public String toString() {
        return "I am a teacher, give me coffee.";
    }

}
