public class RectangularPrism4 {
    private int length;
    private int width;
    private int depth;

    public RectangularPrism4(int l, int w, int d) {
        length = l;
        width  = w;
        depth  = d;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "RectangularPrism4 - " + length + " X " + width + " X " + depth;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        RectangularPrism4 other = (RectangularPrism4) obj;
        return this.length == other.length && this.width == other.width && this.depth == other.depth;
    }
}
