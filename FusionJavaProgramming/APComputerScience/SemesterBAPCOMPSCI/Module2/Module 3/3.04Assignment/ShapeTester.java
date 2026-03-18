public class ShapeTester {
    public static void main(String[] args) {

        Rectangle4 rect1 = new Rectangle4(12, 20);

        Box4 box1 = new Box4(4, 4, 4);
        Box4 box2 = new Box4(4, 12, 8);

        Cube4 cube1 = new Cube4(4);
        Cube4 cube2 = new Cube4(12);
        Cube4 cube3 = new Cube4(18);

        Square4 sq1 = new Square4(6);
        Square4 sq2 = new Square4(9);

        Trapezoid4 trap1 = new Trapezoid4(10, 6, 4);
        Trapezoid4 trap2 = new Trapezoid4(8, 4, 3);

        RectangularPrism4 prism1 = new RectangularPrism4(5, 4, 3);
        RectangularPrism4 prism2 = new RectangularPrism4(5, 4, 3);

        System.out.println("My shapes:");
        System.out.println();
        System.out.println(rect1);
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(cube1);
        System.out.println(cube2);
        System.out.println(cube3);
        System.out.println(sq1);
        System.out.println(sq2);
        System.out.println(trap1);
        System.out.println(trap2);
        System.out.println(prism1);
        System.out.println(prism2);

        System.out.println();
        System.out.println("Test for equality:");
        System.out.println();
        showEffectBoth(box1, cube1);
        showEffectBoth(box2, cube1);
        showEffectBoth(sq1, sq2);
        showEffectBoth(prism1, prism2);
        showEffectBoth(trap1, trap2);
    }

    public static void showEffectBoth(Object obj1, Object obj2) {
        String result = obj1.equals(obj2) ? "IS" : "is NOT";
        System.out.println(obj1 + " " + result + " the same size as " + obj2);
        System.out.println();
    }
}