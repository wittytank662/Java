public class TerrainTester {
    public static void main(String[] args) {
        
        Terrain terrain = new Terrain(150, 240);
        Forest forest = new Forest(200, 100, 200);
        Mountain mountain = new Mountain(8, 450, 550);
        WinterMountain winterMountain = new WinterMountain(-10, 3, 200, 300);
        Desert desert = new Desert(100, 800, 900);
        Oasis oasis = new Oasis(10, 60, 750, 600);

        System.out.println(terrain);
        System.out.println();

        System.out.println(forest);
        System.out.println();

        System.out.println(mountain);
        System.out.println();

        System.out.println(winterMountain);
        System.out.println();

        System.out.println(desert);
        System.out.println();

        System.out.println(oasis);
        System.out.println();
    }
}
