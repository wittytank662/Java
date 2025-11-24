public class CarsV8 {
    private String brand;
    private String model;
    private String engineMake;
    private int topSpeed;
    private int accelSpeed;
    private int brakeSpeed;

    public CarsV8(String _brand, String _model, String _engineMake) {
        brand = _brand;
        model = _model;
        engineMake = _engineMake;
        topSpeed = 0;
        accelSpeed = 0;
        brakeSpeed = 0;
    }

    public CarsV8(String _brand, String _model, String _engineMake, int _topSpeed, int _accelSpeed, int _brakeSpeed) {
        brand = _brand;
        model = _model;
        engineMake = _engineMake;
        topSpeed = _topSpeed;
        accelSpeed = _accelSpeed;
        brakeSpeed = _brakeSpeed;
    }

    public int accelerate(int speed) {
        
        if(speed < topSpeed) {
            if((speed + accelSpeed) > topSpeed) {
                speed = topSpeed;
            } else {
                speed += accelSpeed;
            }
        } else if(speed > topSpeed) {
            System.out.println("The car tries to accelerate more but the engine explodes.");
            engineMake = null;
            speed = 0;
        } else if(speed == topSpeed) {
            System.out.println("The car can not accelerate any more.");
        }
        return speed;
    }

    public int accelerate() {
        return accelerate(0);
    }

    public int brake(int speed) {

        if(speed < brakeSpeed) {
            speed = 0;
        } else {
            speed -= brakeSpeed;
        }
        
        return speed;
        
    }

    public int brake() {
        return brake(0);
    }

    // Getters/Setters

    public String engineSpecs() {
        return engineMake;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getAccelSpeed() {
        return accelSpeed;
    }

    public int getBrakeSpeed() {
        return brakeSpeed;
    }

    public void engineSwap(String engineMake) {
        this.engineMake = engineMake;
    }

    public void changeTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setAccelSpeed(int accelSpeed) {
        this.accelSpeed = accelSpeed;
    }

    public void setBrakeSpeed(int brakeSpeed) {
        this.brakeSpeed = brakeSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
