public class Cube4 extends Box4 {
    public Cube4(int side) {
        super(side, side, side);
    }

    @Override
    public String toString() {
        return "Cube4 - " + getLength() + " X " + getLength() + " X " + getLength();
    }
}
