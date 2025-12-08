public class CarsV3 {
    private String brand;
    private String model;

    public CarsV3(String _brand, String _model) {
        brand = _brand;
        model = _model;
    }

    public void accelerate() {
        System.out.println("The car accelerates.");
    }

    public void brake() {
        System.out.println("The car brakes.");
    }
}
