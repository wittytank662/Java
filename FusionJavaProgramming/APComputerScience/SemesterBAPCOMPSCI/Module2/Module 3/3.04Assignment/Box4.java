/**
 * This class defines a Box object by extending
 * Rectangle4 and includes height.
 *
 * @author Poly Morphism
 * @version 4
 */

public class Box4 extends Rectangle4 {
    private int height;

    public Box4(int l, int w, int h) {
        super(l, w);

        height = h;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Box4 - " + getLength() + " X " + getWidth() + " X " + height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Box4 other = (Box4) obj;
        return this.getLength() == other.getLength() && this.getWidth() == other.getWidth() && this.height == other.height;
    }
}
