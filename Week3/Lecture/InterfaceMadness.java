public class InterfaceMadness {
    public static void main(String[] args) {
        Speaker speaker;
        Flyer flyer;
        Duck duck = new Duck();

        speaker = new Teacher();
        System.out.println(speaker);
        speaker.speak();

        flyer = new Airplane();
        System.out.println("\n" + flyer);
        flyer.fly();

        speaker = duck;
        System.out.println("\n" + speaker);
        speaker.speak();

        flyer = duck;
        System.out.println("\n" + flyer);
        flyer.fly();
    }
}
