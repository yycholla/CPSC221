
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GridRunner {
    public static void main(String[] args) throws FileNotFoundException {
        GridMonitor test = new GridMonitor("sample.txt");
        double[][] gridData, surroundingSumGrid, surroundingAvgGrid, deltaGrid;
        boolean[][] dangerGrid;
        ArrayList<double[][]> arrays = new ArrayList<>();

        gridData = test.getBaseGrid();
        surroundingSumGrid = test.getSurroundingSumGrid();
        surroundingAvgGrid = test.getSurroundingAvgGrid();
        deltaGrid = test.getDeltaGrid();
        dangerGrid = test.getDangerGrid();
        arrays.add(gridData);
        arrays.add(surroundingSumGrid);
        arrays.add(surroundingAvgGrid);
        arrays.add(deltaGrid);

        System.out.println(test.toString());

    }
}
