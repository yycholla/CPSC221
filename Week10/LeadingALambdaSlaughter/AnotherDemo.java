package LeadingALambdaSlaughter;

public class AnotherDemo {
    public static void main(String[] args) {
        AnotherInterface hereWeGo =  (name, numTimes) -> {
                String result = "";
                for (int i = 0; i < numTimes; i++) {
                    result += "Hello, " + name + ", how are you?\n";
                }
                return result;
            };

        System.out.println(hereWeGo.sayHello("Colin", 70));


    AnotherLambda yepAgain = () -> { System.out.println("Yayyyyyy!!!!!!!"); };

    yepAgain.build();

    AnotherLambda pleaseStop = () -> moreComplicatedAlgorithm();

    pleaseStop.build();

    FinalLambda stoppingNow = () -> sortaComplicatedAlgorithm();

    System.out.println(stoppingNow.build());
    }

    private static void moreComplicatedAlgorithm() {
        System.out.println("Check out this complex algo");
        System.out.println("I hope Lambda uses me");
    }

    private static String sortaComplicatedAlgorithm() {
        String result;
        result = "Hello ";
        result += "There ";
        result += "!";
        return result;
    }

}
