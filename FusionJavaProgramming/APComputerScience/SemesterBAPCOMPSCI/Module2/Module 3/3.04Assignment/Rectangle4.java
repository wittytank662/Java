/**
 * This class defines a Rectangle object using
 * length and width.
 *
 * @author Poly Morphism
 * @version 4
 */

public class Rectangle4 {
    private int length;
    private int width;

    public Rectangle4(int l, int w) {
        length = l;
        width = w;
    }

    public String getName() {
        return "Rectangle";
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle4 - " + length + " X " + width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle4 other = (Rectangle4) obj;
        return this.length == other.length && this.width == other.width;
    }
}
