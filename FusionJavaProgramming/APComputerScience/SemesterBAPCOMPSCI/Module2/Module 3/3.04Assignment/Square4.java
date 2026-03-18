public class Square4 extends Rectangle4 {
    public Square4(int side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "Square4 - " + getLength() + " X " + getLength();
    }
}
