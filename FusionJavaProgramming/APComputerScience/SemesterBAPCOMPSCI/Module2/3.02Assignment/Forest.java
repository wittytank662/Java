public class Forest extends Terrain {
    private int numTrees;

    public Forest(int nT, int length, int width) {
        super(length, width);

        numTrees = nT;
    }

    public String toString() {
        return "Forest " + getTerrainSize() + " and has " + numTrees + " trees";
    }
}
