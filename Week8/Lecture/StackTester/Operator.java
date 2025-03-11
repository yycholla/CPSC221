package Week7.Lecture.StackTester;

import java.util.InputMismatchException;
/**
 * This enumeration defines the valid mathematical operators
 * that can be used.
 * @author chanway
 * @version 3.14.15.19
 */
public enum Operator {
    /**
     * Addition Operation
     */
    ADD('+'),
    /**
     * Subtraction operation
     */
    SUBTRACT('-'),
    /**
     * Multiplication operation
     */
    MULTIPLY('*'),
    /**
     * Division operation
     */
    DIVIDE('/');

    private char symbol;

    private Operator(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Getter to return the appropriate operator symbol: +, -, *, /
     * @return the character associated with the operator value
     */
    public char getSymbol() {
        return symbol;
    }

    public String toString() {
        return symbol + "";
    }

    /**
     * Method to calculate the mathematical operation of the given binary operator
     * @param left the left hand operand in the infix expression
     * @param right the right hand operand in the infix expression
     * @return the result of the infix expression.
     */
    public int evaluate(int left, int right) {
        switch (this) {
            case ADD:
                return left + right;
            case SUBTRACT:
                return left - right;
            case MULTIPLY:
                return left * right;
            case DIVIDE:
                return left / right;
        }
        throw new RuntimeException("Unrecognized operator in evaluate");
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

    public static Operator fromCharacter(char symbol) {
        for (Operator operator : Operator.values()) {
            if (operator.getSymbol() == symbol) {
                return operator;
            }
        }
        throw new InputMismatchException("Invalid operator symbol: " + symbol);
    }

    public static Operator fromString(String symbol) {
        if (symbol.length() != 1 ) { throw new InputMismatchException("Invalid operator symbol: " + symbol); } //guard statement

        return fromCharacter(symbol.charAt(0));
    }
}
