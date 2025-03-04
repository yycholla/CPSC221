package Week6.Lecture.StackTester;

import java.util.Scanner;
import java.util.Stack;

public class PostFixEvaluator {
    private Stack<Integer> stack;

    public PostFixEvaluator() {
        stack = new Stack<Integer>();
    }

    public int evaluate(String expression) {
        // ``` 7 4 -3 * 1 5 + / * ```
        Scanner parser = new Scanner(expression);

        int x, y, result = -1;
        String operand, token;
        while(parser.hasNext()) {
            token = parser.next();
            if (Operator.isOperator(token)) {
                x = stack.pop();
                y = stack.pop();
                result = -1;

                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }


        return -1;
    }
}
