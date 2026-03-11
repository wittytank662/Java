public class Oasis extends Desert{
    private int waterLevel;
    private int cacti;

    public Oasis(int wL, int numCactus, int l, int w) {
        super(numCactus, l, w);

        waterLevel = wL;
        cacti = numCactus;
    }

    public String toString() {
        return "Oasis " + getTerrainSize() + " and has " + waterLevel + " foot water level and " + cacti + " cacti";
    }
}
