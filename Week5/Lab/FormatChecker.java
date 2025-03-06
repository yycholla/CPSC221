package Week5.Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FormatChecker {
    public static void main(String[] args) throws NumberFormatException {
        File file;
        Scanner scan;
        int rows, columns, rowCount;
        double value;
        boolean valid = true, columnError = false, invalidDimensions = false;

        if (args.length == 0) {
            System.out.println("Usage: $ java FormatChecker file1 [file2 ... fileN]");
        }

        for (String filename : args) {
            try {
                valid = true;
                value = 0;
                invalidDimensions = false;
                System.out.println(filename);
                file = new File(filename);
                scan = new Scanner(file);
                String dimensions = scan.nextLine();
                String[] dimArray = dimensions.split("\\s+");
                if (dimArray.length != 2) {
                    invalidDimensions = true;
                    valid = false;
                }
                rows = Integer.parseInt(dimArray[0]);
                columns = Integer.parseInt(dimArray[1]);
                rowCount = 0;

                while (scan.hasNextLine()) {
                    String stringy = scan.nextLine();
                    if (!stringy.isEmpty()) {
                        String[] values = stringy.split("\\s+");
                        rowCount++;
                        for (String string : values) {
                            value = Double.parseDouble(string);
                        }
                        if (values.length != columns) {
                            valid = false;
                            columnError = true;
                        }

                    }
                }
                if (rowCount != rows || columnError) {
                    System.out.println("The contents of the file do not match declared amount of rows or columns");
                    valid = false;
                }
                if (invalidDimensions) {
                    System.out.println("The provided dimensions are not in a valid format.");
                }

            } catch (FileNotFoundException e) {
                System.out.println(e);
                valid = false;
            } catch (NumberFormatException e) {
                System.out.println(e);
                valid = false;
            } catch (InputMismatchException e) {
                System.out.println(e);
                valid = false;
            } catch (Exception e) {
                System.out.println(e);
                valid = false;
            } finally {
                if (valid) {
                    System.out.println("VALID\n");
                } else {
                    System.out.println("INVALID\n");
                }
            }
        }
    }
}
