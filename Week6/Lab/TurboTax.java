import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * It's time for some accounting.
 */
public class TurboTax {
    public static void main(String[] args) throws FileNotFoundException {
        // Array size zero
        PrintStream outfileZero = new PrintStream("Zeroes.csv");
        outfileZero.println("size, statements");

        // Randomized Array
        PrintStream outfileRand = new PrintStream("Random.csv");
        outfileRand.println("size, index, statements");

        // Randomized Array with Duplicates
        PrintStream outfileRandDupes = new PrintStream("RandomWithDupes.csv");
        outfileRandDupes.println("size, dupes, statements");

        // Ascending Array
        PrintStream outfileAsc = new PrintStream("Ascending.csv");
        outfileAsc.println("size, target, Find Statements, Replace Statments, Sort Statements");

        // Decending array
        PrintStream outfileDec = new PrintStream("Decending.csv");
        outfileDec.println("size, target, Find Statements, Replace Statments, Sort Statements");

        int[] rand = ArrayOfInts.ascendingArray(100);
        int[] asc = ArrayOfInts.ascendingArray(100);
        int[] dec = ArrayOfInts.descendingArray(100);

        for (int i = 0; i < 101; i++) {
            int[] array = ArrayOfInts.descendingArray(i);
            MethodsToAnalyze.sortIt(array);
            outfileZero.println(i + ", " + MethodsToAnalyze.getStatementCounter());
            MethodsToAnalyze.resetStatementCounter();
        }

    }
}
