public class WinterMountain extends Mountain{
    private double temperature;
    private int numMountains;

    public WinterMountain(double t, int nM, int l, int w) {
        super(nM, l, w);

        temperature = t;
        numMountains = nM;
    }

    public String toString() {
        return "Winter Mountain " + getTerrainSize() + " and has " + numMountains + " mountains and temperature " + temperature + " degrees";
    }
}
