
import java.io.FileNotFoundException;

public class GridRunner {
    public static void main(String[] args) throws FileNotFoundException {
        GridMonitor test = new GridMonitor("sample.txt");
        double[][] gridData, surroundingSumGrid, surroundingAvgGrid, deltaGrid;
        boolean[][] dangerGrid;

        gridData = test.getBaseGrid();
        surroundingSumGrid = test.getSurroundingSumGrid();
        surroundingAvgGrid = test.getSurroundingAvgGrid();
        deltaGrid = test.getDeltaGrid();
        dangerGrid = test.getDangerGrid();

        for (int i = 0; i < gridData.length; i++) {
            for (int j = 0; j < gridData[i].length; j++) {
                System.out.println("Grid: " + gridData[i][j] + " Range: " + (surroundingAvgGrid[i][j] - deltaGrid[i][j])+ "-" + (surroundingAvgGrid[i][j] + deltaGrid[i][j])+ " danger: " + dangerGrid[i][j]);
            }
        }

    }
}
