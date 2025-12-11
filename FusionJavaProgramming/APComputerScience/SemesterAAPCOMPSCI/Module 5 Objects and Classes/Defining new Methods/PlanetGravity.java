public class PlanetGravity {

    public static double calcGravity(double diameter, double mass){
        double G = 6.67e-11;
        double radiusMeters = (diameter * 1000) / 2.0;

        double gravity = (G * mass) / (radiusMeters * radiusMeters);

        return gravity;
    }

    public static void displayHeader(){
        System.out.println("Planet  Diameter (km)   Mass (kg)       g (m/s^2)");
        System.out.println("---------------------------------------------------------------");
    }

    public static void displayPlanetData(String name, double diameter, double mass, double gravity) {
        System.out.println(name + "\t" + diameter + "\t\t" + mass + "\t" + gravity);
    }
    public static void main(String[] args) {
        String planetName = "Mars";
        double diameterKm = 6794;
        double massKg = 6.4219e23;

        double gravity = calcGravity(diameterKm, massKg);

        displayHeader();
        displayPlanetData(planetName, diameterKm, massKg, gravity);
    }
}
