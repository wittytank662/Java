public class Trapezoid4 {
    private int base1;
    private int base2;
    private int height;

    public Trapezoid4(int b1, int b2, int h) {
        base1  = b1;
        base2  = b2;
        height = h;
    }

    public int getBase1() {
        return base1;
    }

    public int getBase2() {
        return base2;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Trapezoid4 - " + base1 + " X " + base2 + " X " + height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Trapezoid4 other = (Trapezoid4) obj;
        return this.base1 == other.base1 && this.base2 == other.base2 && this.height == other.height;
    }
}
