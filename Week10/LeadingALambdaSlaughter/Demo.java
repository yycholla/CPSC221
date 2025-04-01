package LeadingALambdaSlaughter;

public class Demo {
    public static void main(String[] args) {
        // MySampleInterface someVariable = new UnnessaryClass();
        // Another yep = new Another();

        // yep.iDoStuff(someVariable);
        // (new Another()).iDoStuff(new UnnessaryClass()); // Anonymous object

        // This is an anonymous class
        // MySampleInterface someVariable = new MySampleInterface() {

        //     @Override
        //     public void tryThis() {
        //     String message = "I'm glad you tried this";
        //     System.out.println(message);
        //     }

        //     @Override
        //     public int tryThat(int number) {
        //     return number % 2;
        //     }

        // };

        (new Another()).iDoStuff(new MySampleInterface() {
            @Override
            public void tryThis() {
            String message = "I'm glad you tried this";
            System.out.println(message);
            }

            @Override
            public int tryThat(int number) {
            return number % 2;
            }
        });

    }
}
