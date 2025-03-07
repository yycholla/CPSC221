/**
 * A collection of methods that work with arrays of ints.
 *
 * @author lsevigny
 */
public class MethodsToAnalyze {

	public static long statementCounter = 0;
	public static int globalIndex;

	/**
	 * Return index where value is found in array or -1 if not found.
	 *
	 * @param array ints where value may be found
	 * @param value int that may be in array
	 * @return index where value is found or -1 if not found
	 */
	public static int find(int[] array, int value) {
		statementCounter += 1; // Instantiate i
		for (int i = 0; i < array.length; i++) {
			statementCounter += 3; // Check if statement + check for statement + inc i
			if (array[i] == value) {
				statementCounter += 1; // return
				return i;
			}
		}
		statementCounter += 2; // return + final check for, no match
		return -1;
	}

	/**
	 * Replace all occurrences of oldValue with newValue in array.
	 *
	 * @param array    ints where oldValue may be found
	 * @param oldValue value to replace
	 * @param newValue new value
	 */
	public static void replaceAll(int[] array, int oldValue, int newValue) {
		statementCounter += 1; // initialize index
		int index = find(array, oldValue);
		while (index > -1) {
			statementCounter += 3; // Check while statement + set array value at index + set index to next index of
			array[index] = newValue;
			index = find(array, oldValue);
		}
		statementCounter += 1; // Check while statement when false
	}

	/**
	 * Take an int[] and reorganize it so they are in ascending order.
	 *
	 * @param array ints that need to be ordered
	 */
	public static void sortIt(int[] array) {
		statementCounter += 2; // Initialize next + increment next
		for (int next = 1; next < array.length; next++) {
			statementCounter += 2; // Initialize value + Init index
			int value = array[next];
			int index = next;
			while (index > 0 && value < array[index - 1]) {
				statementCounter += 3; // And statement considered one --Gemini + set array[index] = previous +
										// decrement index
				array[index] = array[index - 1];
				index--;
			}
			statementCounter += 2; // Final while check + set array[index] = value
			array[index] = value;
		}
	}

	public static long getStatementCounter() {
		return statementCounter;
	}

	public static void resetStatementCounter() {
		statementCounter = 0;
	}

	public static int getGlobelIndex() {
		return globalIndex;
	}
}
