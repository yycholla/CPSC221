import java.io.FileNotFoundException;

public class GridMonitor implements GridMonitorInterface {
    private int rows, columns;
    private double[][] gridData, surroundingSumGrid, surroundingAvgGrid, deltaGrid;
    private boolean[][] dangerGrid;
    private String gridString;

    public GridMonitor(String filename) throws FileNotFoundException {

    }

    @Override
    public double[][] getBaseGrid() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBaseGrid'");
    }

    @Override
    public double[][] getSurroundingSumGrid() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSurroundingSumGrid'");
    }

    @Override
    public double[][] getSurroundingAvgGrid() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSurroundingAvgGrid'");
    }

    @Override
    public double[][] getDeltaGrid() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDeltaGrid'");
    }

    @Override
    public boolean[][] getDangerGrid() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDangerGrid'");
    }
}
