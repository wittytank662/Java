public class Mountain extends Terrain {
    private int numMountains;

    public Mountain(int nM, int length, int width) {
        super(length, width);

        numMountains = nM;
    }

    public String toString() {
        return "Mountain " + getTerrainSize() + " and has " + numMountains + " mountains";
    }
}
