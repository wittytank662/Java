// Sam 03/09/2026

import java.util.ArrayList;

public class CircleTester {

    public static void polyMorph(Circle2 c) {
        System.out.println("For " + c.getName() + ": ");
        System.out.println("    " + c.getCenter());
        System.out.println("    radius is " + c.getRadius());
    }

    public static void showCenter(Circle2 c) {
        System.out.println("For this " + c.getName() + " the center is at " + c.getCenter());
    }
    public static void main(String[] args) {

        ArrayList<Circle2> circles = new ArrayList<Circle2>();

        circles.add(new Circle2(0, 0, 5));
        circles.add(new Cylinder2(10, 0, 5, 10));
        circles.add(new Oval2(0, 10, 10, 5));
        circles.add(new OvalCylinder2(-10, 0, 5, 10, 14));

        for(int index = 0; index < circles.size(); index++) {
            showCenter(circles.get(index));
        }

        // showCenter(circles.get(0));
        // showCenter(circles.get(1));
        // showCenter(circles.get(2));
        // showCenter(circles.get(3));

        // polyMorph(one);
        // System.out.println();

        // polyMorph(two);
        // System.out.println("    name is " + two.getName());
        // System.out.println("    height is " + ((Cylinder2)two).getHeight());
        // System.out.println();

        // polyMorph(three);
        // System.out.println("    name is " + three.getName());
        // System.out.println("    radius2 is " + ((Oval2)three).getRadius2());
        // System.out.println();

        // polyMorph(four);
        // System.out.println("    name is " + four.getName());
        // System.out.println("    radius2 is " + ((OvalCylinder2)four).getRadius2());
        // System.out.println("    height is " + ((OvalCylinder2)four).getHeight());
        // System.out.println();
    }
}
