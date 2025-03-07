import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * It's time for some accounting.
 */
public class TurboTax {
    public static void main(String[] args) throws FileNotFoundException {
        // Array size zero
        PrintStream outfileZero = new PrintStream("Zeroes.csv");
        outfileZero.println("size, Find Statements, Replace Statments, Sort Statements");

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

        for (int size = 1; size < 101; size++) {
            for (int i = 1; i < size + 1; i++) {
                int[] array = ArrayOfInts.randomizedArrayWithDuplicates(size, i);
                MethodsToAnalyze.replaceAll(array, 1, 2);
                outfileRandDupes.println(size + ", " + i + ", " + MethodsToAnalyze.getStatementCounter());
                MethodsToAnalyze.resetStatementCounter();
            }
        }

    }
}
