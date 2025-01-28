import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Console app to take data from a array of high performing solar panels and
 * calculate if each individual panel is operating in safe spec.
 *
 * @author Chanway
 */

public class GridMonitor implements GridMonitorInterface {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    private int rows, columns, warningCount;
    private double[][] gridData, surroundingSumGrid, surroundingAvgGrid, deltaGrid, copyDouble;
    private boolean[][] dangerGrid, copyBoolean;
    private boolean warning;
    private String output, fileName, copyString;

    private File file;
    private Scanner scan;

    public GridMonitor(String fileName) throws FileNotFoundException {
        this.output = "Base Grid \n\n";
        this.warning = false;
        this.warningCount = 0;

        this.fileName = fileName;
        this.file = new File(fileName);
        this.scan = new Scanner(file);

        this.rows = scan.nextInt();
        this.columns = scan.nextInt();
        this.copyBoolean = new boolean[this.rows][this.columns];
        this.copyDouble = new double[this.rows][this.columns];

        this.gridData = new double[this.rows][this.columns];
        setBaseGrid(file);

        this.surroundingSumGrid = new double[this.rows][this.columns];
        setSurroundingSum();

        this.surroundingAvgGrid = new double[this.rows][this.columns];
        setSurroundingAvg();

        this.deltaGrid = new double[this.rows][this.columns];
        setDeltaGrid();

        this.dangerGrid = new boolean[this.rows][this.columns];
        setDangerGrid();
        scan.close();
    }

    /**
     * Sets the base grid for the current grid data. This method is not
     * exposed, as it is only used internally to initialize the base grid.
     * The base grid is a 2D array of double values, where each element is
     * read from the file specified by the fileName parameter.
     */
    private void setBaseGrid(File file) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.gridData[i][j] = scan.nextDouble();
            }
        }
    }

    /**
     * Returns a deep copy of the original base grid, as read from file.
     *
     * @return deep copy of base grid
     */
    public double[][] getBaseGrid() {
        return deepDoubleCopy(gridData);
    }

    /**
     * Sets the surroundingSumGrid for the current grid data. This method is not
     * exposed, as it is only used internally to calculate the surrounding sum
     * grid. The surrounding sum grid is a grid where each element is the sum of
     * the 4 surrounding elements in the base grid. For elements on a grid border,
     * the base element's own value is used when looking out of bounds, as if there
     * is a mirror surrounding the grid.
     */
    private void setSurroundingSum() {
        double up, down, left, right, sum;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                up = (j - 1 < this.columns && j - 1 >= 0) ? this.gridData[i][j - 1] : this.gridData[i][j];
                down = (j + 1 < this.columns && j + 1 >= 0) ? this.gridData[i][j + 1] : this.gridData[i][j];
                left = (i - 1 < this.rows && i - 1 >= 0) ? this.gridData[i - 1][j] : this.gridData[i][j];
                right = (i + 1 < this.rows && i + 1 >= 0) ? this.gridData[i + 1][j] : this.gridData[i][j];
                sum = up + down + left + right;
                this.surroundingSumGrid[i][j] = sum;
            }
        }
    }

    /**
     * Returns a copy of the surrounding sum grid. Each element in this grid
     * represents the sum of the four surrounding elements in the base grid.
     * For elements on the border of the grid, the element's own value is used
     * as if there is a mirror surrounding the grid.
     *
     * @return a deep copy of the grid containing the sum of adjacent positions
     */

    public double[][] getSurroundingSumGrid() {
        return deepDoubleCopy(surroundingSumGrid);
    }

    /**
     * Computes the surrounding average grid based on the surrounding sum grid.
     * Each element in the surrounding average grid is calculated by dividing
     * the corresponding element in the surrounding sum grid by 4.
     * This method updates the internal surroundingAvgGrid with these computed
     * average values for each grid position.
     */

    private void setSurroundingAvg() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.surroundingAvgGrid[i][j] = (this.surroundingSumGrid[i][j] / 4.00);
            }
        }
    }

    /**
     * Returns the average value of the surrounding 4 base elements
     * per grid location. The average is always the sum devided by 4.
     *
     * @return a deep copy of the grid consisting of the sum of each position
     *         devided by 4 to provide the average.
     */
    public double[][] getSurroundingAvgGrid() {
        return deepDoubleCopy(surroundingAvgGrid);
    }

    /**
     * Calculates the delta grid, which represents the maximum deviation allowed
     * from the average of the surrounding grid elements. This delta is calculated
     * as 50% of the surrounding average for each panel. The delta grid is used
     * to determine safe operating ranges for the grid panels.
     */

    public void setDeltaGrid() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.deltaGrid[i][j] = Math.abs(this.surroundingAvgGrid[i][j] / 2.00);
            }
        }
    }

    /**
     * Returns a grid with the same dimensions as the base grid, where each element
     * represents the maximum allowable deviation from the surrounding average.
     * The delta value at each position is calculated as 50% of the surrounding
     * average.
     * This grid is used to determine safe operating ranges for each panel.
     *
     * @return a deep copy of the delta grid, representing maximum deviation from
     *         average for each grid element
     */

    public double[][] getDeltaGrid() {
        return deepDoubleCopy(deltaGrid);
    }

    /**
     * Sets the danger grid for the current grid data. This method is not
     * exposed, as it is only used internally to calculate the danger grid.
     * The danger grid is a boolean array where true indicates that the
     * panel is not within safe operating range compared to its
     * adjacent panels.
     */
    private void setDangerGrid() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.dangerGrid[i][j] = !((this.gridData[i][j] < (this.surroundingAvgGrid[i][j] + this.deltaGrid[i][j]))
                        && (this.gridData[i][j] > (this.surroundingAvgGrid[i][j] - this.deltaGrid[i][j])));
            }
        }
    }

    /**
     * Returns a grid with the same dimensions as the base grid, where each element
     * represents whether the panel at the same location is in danger of exploding.
     * A panel is in danger if its value is outside the safe range, which is
     * defined as the surrounding average plus or minus 50% of the surrounding
     * average.
     *
     * @return a deep copy of the danger grid, indicating whether each panel is in
     *         danger of exploding
     */
    public boolean[][] getDangerGrid() {
        return deepBoolCopy(dangerGrid);
    }

    /**
     * Creates a deep copy of the 2D double array.
     *
     * @param original
     *                 2D double array to be copied
     * @return a deep copy of the original array
     */
    private double[][] deepDoubleCopy(double[][] original) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.copyDouble[i][j] = original[i][j];
            }
        }
        return this.copyDouble;
    }

    /**
     * Creates a deep copy of the 2D boolean array.
     *
     * @param original
     *                 2D boolean array to be copied
     * @return a deep copy of the original array
     */
    private boolean[][] deepBoolCopy(boolean[][] original) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.copyBoolean[i][j] = original[i][j];
            }
        }
        return this.copyBoolean;
    }

    /**
     * Returns a copy the name of the file that was used to create this GridMonitor
     * object.
     *
     * @return the copied name of the file
     */
    public String getFileName() {
        this.copyString = this.fileName;
        return this.copyString;
    }

    /**
     * Returns a string representation of the GridMonitor object, including the
     * name of the file used to create it and a 2D grid of strings indicating
     * whether each panel is operating within safe parameters. The grid uses
     * colors to indicate the status of each panel, with red indicating a
     * warning and green indicating a safe status. If any panels are operating
     * in a warning state, a message at the end of the string indicates the
     * total number of panels in this state.
     *
     * @return a string representation of the GridMonitor object
     */
    public String toString() {
        this.output += getFileName() + " PANEL WARNING\n";
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (getDangerGrid()[i][j]) {
                    this.output += "[ " + ANSI_RED + "WARN" + ANSI_RESET + " ] ";
                    this.warning = true;
                    warningCount++;
                } else {
                    this.output += "[ " + ANSI_GREEN + "SAFE" + ANSI_RESET + " ] ";
                }
            }
            this.output += "\n";
        }
        if (this.warning) {
            this.output += ANSI_RED + "\n\n !!! " + this.warningCount + " PANELS OPERATING IN DANGER ZONE !!!\n\n"
                    + ANSI_RESET;
        }
        return this.output;
    }
}
