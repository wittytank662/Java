public class Desert extends Terrain {
    private int numCacti;

    public Desert(int nC, int length, int width) {
        super(length, width);

        numCacti = nC;
    }

    public String toString() {
        return "Desert " + getTerrainSize() + " and has " + numCacti + " cacti";
    }
}
