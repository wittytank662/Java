public class FarmAreaObject {
    
    private String farmName;
    private double farmLength;
    private double farmWidth;
    private double farmArea;
    private double farmPerimeter;

    public FarmAreaObject(String name, double farmLength, double farmWidth) {
        farmName = name;
        this.farmLength = farmLength;
        this.farmWidth = farmWidth;
    }

    // Calculate farm area

    public double calculateArea() {
        farmArea = farmLength * farmWidth;
        return farmArea;
    }

    // Calculate farm perimeter

    public double calculatePerimeter() {
        farmPerimeter = (farmLength * 2) + (farmWidth * 2);
        return farmPerimeter;
    }

    // Getters

    public String getFarmName() {
        return farmName;
    }

    public double getFarmLength() {
        return farmLength;
    }

    public double getFarmWidth() {
        return farmWidth;
    }

    // Setters

    public void setFarmName(String name) {
        farmName = name;
    }

    public void setFarmLength(double length) {
        farmLength = length;
    }

    public void setFarmWidth(double width) {
        farmWidth = width;
    }

}
