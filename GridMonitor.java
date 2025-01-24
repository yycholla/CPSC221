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

    @Override
    public double[][] getBaseGrid() {
        double[][] returnGrid = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                returnGrid[i][j] = gridData[i][j];
            }
        }
        return returnGrid;
    }

    @Override
    public double[][] getSurroundingSumGrid() {
        double up, down, left, right, sum;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                up = (j - 1 < columns && j - 1 >= 0) ? gridData[i][j - 1] : gridData[i][j];
                down = (j + 1 < columns && j + 1 >= 0) ? gridData[i][j + 1] : gridData[i][j];
                left = (i - 1 < rows && i - 1 >= 0) ? gridData[i - 1][j] : gridData[i][j];
                right = (i + 1 < rows && i + 1 >= 0) ? gridData[i + 1][j] : gridData[i][j];
                sum = up + down + left+ right;
                surroundingSumGrid[i][j] = sum;
            }
        }
        return surroundingSumGrid;
    }

    @Override
    public double[][] getSurroundingAvgGrid() {
        surroundingSumGrid = getSurroundingSumGrid();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                surroundingAvgGrid[i][j] = (surroundingSumGrid[i][j] / 4.00);
            }
        }
        return surroundingAvgGrid;
    }

    @Override
    public double[][] getDeltaGrid() {
        surroundingAvgGrid = getSurroundingAvgGrid();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                deltaGrid[i][j] = Math.abs(surroundingAvgGrid[i][j] / 2.00);
            }
        }
        return deltaGrid;
    }

    @Override
    public boolean[][] getDangerGrid() {
        deltaGrid = getDeltaGrid();
        surroundingAvgGrid = getSurroundingAvgGrid();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                dangerGrid[i][j] = !((gridData[i][j] < (surroundingAvgGrid[i][j] + deltaGrid[i][j])) && (gridData[i][j] > (surroundingAvgGrid[i][j] - deltaGrid[i][j])));
            }
        }
        return dangerGrid;
    }

    public String toString() {
        gridString = gridData.toString();
        return gridString;
    }
}
