package Week7.Lecture.StackTester;

import java.util.Scanner;

public class PostFixTester {
    public static void main(String[] args) {
        String expression;
        int result;
        Scanner scan = new Scanner(System.in);
        PostFixEvaluator evaluator = new PostFixEvaluator();

        System.out.println("Enter a valid PostFix expression \n\t(One token at a time space delineated): ");
        expression = scan.nextLine();

        result = evaluator.evaluate(expression);

        System.out.println(expression + "\nThat expression equals: " + result);

        scan.close();
    }
}
