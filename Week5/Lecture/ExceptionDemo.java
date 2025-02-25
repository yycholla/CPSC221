import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int numerator, denominator, result;
        boolean isBadData;
        Scanner keyboard = new Scanner(System.in);

        do {
            isBadData = false;
            try {
                System.out.println("Enter a numerator: ");
                numerator = keyboard.nextInt();
                System.out.println("Enter a denominator: ");
                denominator = keyboard.nextInt();
                result = numerator / denominator;
                System.out.println("The result is: " + result);
                displayTheName(result, "Bilbo", "Frodo", "Samwise", "Smeagal");
            } catch (InputMismatchException exception) {
                System.out.println("You didn't enter a valid number.");
                isBadData = true;
            } catch (ArithmeticException exception) {
                System.out.println("Why are you dividing by zero?");
                isBadData = true;
                throw new RuntimeException("What the heck?!");
            } catch (Exception exception) {
                System.out.println("Something happened... not quite sure what.");
                isBadData = true;
            } finally {
                keyboard.nextLine(); // clears the scanner buffer
                System.out.println("Hope you are enjoying the app...");
            }
            System.out.println("Please rate my app...");    
        } while (isBadData);
        System.out.println("Hope to see you again!");
    }

    private static void displayTheName(int index, String...names) {
        try {
            System.out.println("The name I choose is: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Couldn't give you a name at that index...");
            System.out.println("How about " + names[names.length-1]);
        }
        
    }
}