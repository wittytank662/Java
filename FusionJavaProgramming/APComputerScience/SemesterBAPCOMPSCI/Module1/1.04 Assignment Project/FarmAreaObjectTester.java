public class FarmAreaObjectTester {
    public static void main(String[] args) {

        FarmAreaObject[] farms = {
            new FarmAreaObject("Wheat Farm", 120.5, 80),
            new FarmAreaObject("Apple Farm", 95.0, 60.5),
            new FarmAreaObject("Tree Farm", 150.0, 100.0),
            new FarmAreaObject("Tomato Farm", 110.0, 75.5),
            new FarmAreaObject("Animal Farm", 130.0, 90.0)
        };

        double totalArea = 0;
        double totalPerimeter = 0;

        System.out.println("              Farm Area Report");
        System.out.printf("%-12s %8s %8s %10s %12s%n", "Farm Name", "Length", "Width", "Area", "Perimeter");
        System.out.println("================================================================================");

        for (FarmAreaObject farm : farms) {
            System.out.println(farm);
            totalArea += farm.getFarmArea();
            totalPerimeter += farm.getFarmPermieter();
        }

        double avgArea = totalArea / farms.length;
        double avgPerimeter = totalPerimeter / farms.length;

        // Output averages

        System.out.println("================================================================================");
        System.out.printf("Average Area: %.2f%n", avgArea);
        System.out.printf("Average Perimeter: %.2f%n", avgPerimeter);

    }
}
