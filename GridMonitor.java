import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GridMonitor implements GridMonitorInterface {
    private int rows, columns;
    private double[][] gridData;
    private double[][] surroundingSumGrid, surroundingAvgGrid, deltaGrid;
    private boolean[][] dangerGrid;
    private String gridString;

    public GridMonitor(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scan = new Scanner(file);
        rows = scan.nextInt();
        columns = scan.nextInt();
        gridData = new double[rows][columns];
        surroundingSumGrid = new double[rows][columns];
        surroundingAvgGrid = new double[rows][columns];
        deltaGrid = new double[rows][columns];
        dangerGrid = new boolean[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                gridData[i][j] = scan.nextDouble();

            }

        }
    }

    /**
     * Returns a copy of the original base grid, as read from file.
     *
     * @return base grid
     */
    public double[][] getBaseGrid() {
        double[][] returnGrid = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                returnGrid[i][j] = gridData[i][j];
            }
        }
        return returnGrid;
    }

    /**
     * Returns a grid with the same dimensions as the base grid, but each element
     * is the sum of the 4 surrounding base elements. For elements on a grid border,
     * the base element's own value is used when looking out of bounds.
     * This method is exposed for testing.
     *
     * @return grid containing the sum of adjacent positions for each position in
     *         the grid.
     */
    public double[][] getSurroundingSumGrid() {
        double up, down, left, right, sum;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                up = (j - 1 < columns && j - 1 >= 0) ? gridData[i][j - 1] : gridData[i][j];
                down = (j + 1 < columns && j + 1 >= 0) ? gridData[i][j + 1] : gridData[i][j];
                left = (i - 1 < rows && i - 1 >= 0) ? gridData[i - 1][j] : gridData[i][j];
                right = (i + 1 < rows && i + 1 >= 0) ? gridData[i + 1][j] : gridData[i][j];
                sum = up + down + left + right;
                surroundingSumGrid[i][j] = sum;
            }
        }
        return surroundingSumGrid;
    }

    /**
     * Returns the average value of the surrounding 4 base elements
     * per grid location. Due to the cardinal directions being the elements summed,
     * the average is always the sum devided by 4.
     *
     * @return grid consisting of the sum of each position devided by 4 to provide
     *         the average.
     */
    public double[][] getSurroundingAvgGrid() {
        surroundingSumGrid = getSurroundingSumGrid();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                surroundingAvgGrid[i][j] = (surroundingSumGrid[i][j] / 4.00);
            }
        }
        return surroundingAvgGrid;
    }

    /**
     * In order to operate withn our safety ratings, the maximum deviation the
     * panels can have from
     * the average of adjacent panels is 50% of the average to either side. This
     * method returns
     * the delta for each panel for future calculation.
     *
     * @return grid consisting of the maximum deviation allowed on each panel.
     */
    public double[][] getDeltaGrid() {
        surroundingAvgGrid = getSurroundingAvgGrid();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                deltaGrid[i][j] = Math.abs(surroundingAvgGrid[i][j] / 2.00);
            }
        }
        return deltaGrid;
    }

    /**
     * In order to notify the crew of any panels operating out of spec, this method
     * calculates
     * the safe operating range of each panel compared to adjacent panels and
     * compares it to it's current value.
     * If the panel is within safe operating range the panel reports false for use
     * in instrumentation and automation
     *
     * @return grid consisting of boolean operating states of the each panel. False
     *         for no issue, true if the panel is operating in a dangerous state.
     */
    public boolean[][] getDangerGrid() {
        deltaGrid = getDeltaGrid();
        surroundingAvgGrid = getSurroundingAvgGrid();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                dangerGrid[i][j] = !((gridData[i][j] < (surroundingAvgGrid[i][j] + deltaGrid[i][j]))
                        && (gridData[i][j] > (surroundingAvgGrid[i][j] - deltaGrid[i][j])));
            }
        }
        return dangerGrid;
    }

    public String toString() {
        gridString = gridData.toString();
        return gridString;
    }
}
