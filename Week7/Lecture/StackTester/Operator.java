package Week6.Lecture.StackTester;

public enum Operator {
    ADD('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/');
    private char symbol;

    private Operator(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static Boolean isOperator(char token) {
        for (Operator operator : Operator.values()) {
            if (operator.getSymbol() == token) {
                return true;
            }
        }
        return false;
    }

    public static boolean isOperator(String token) {
        if (token.length() != 1 ) { return false; } //guard statement

        return isOperator(token.charAt(0));
    }
}
