public class CatapultTester {

    public static void printResults(double[][] array, int[] angleArray) {
        System.out.printf("%n%40s%n", "Projectile Distance (feet)");
        System.out.printf("%-6s", "MPH");
        for (int angle: angleArray) {
            System.out.printf("%9s", angle + " deg");
        }
        System.out.println();
        System.out.println("=".repeat(6 + angleArray.length * 9));

        for (double[] row : array) {
            System.out.printf("%-6.0f", row[0]);
            for (int col = 1; col < row.length; col++) {
                System.out.printf("%9.1f", row[col]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] speedArray = {20, 25, 30, 35, 40, 45, 50};
        int[] angleArray = {25, 30, 35, 40, 45, 50};

        double[][] twoDimArray = new double[speedArray.length][angleArray.length + 1];

        Catapult myCatapult = new Catapult();

        for (int i = 0; i < speedArray.length; i++) {
            twoDimArray[i][0] = speedArray[i];
            for (int j = 0; j < angleArray.length; j++) {
                twoDimArray[i][j + 1] = myCatapult.calcDistance(speedArray[i], angleArray[j]);
            }
        }

        printResults(twoDimArray, angleArray);
    }
}
