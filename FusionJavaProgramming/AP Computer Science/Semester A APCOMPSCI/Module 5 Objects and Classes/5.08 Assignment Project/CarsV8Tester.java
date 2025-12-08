public class CarsV8Tester {
    public static void main(String[] args) {
        
        // Make Cars
        CarsV8 porsche911 = new CarsV8("Porsche", "911 Turbo", "Flat 6", 205, 30, 35);
        CarsV8 ferrari812Superfast = new CarsV8("Ferrari", "812 Superfast", "V12", 211, 40, 45);
        CarsV8 fordMustangGT = new CarsV8("Ford", "Mustang GT", "V8", 155, 45, 50);
        CarsV8 projectCar = new CarsV8("Toyota", "Supra", "I4");

        // Initiate speed
        int porscheSpeed = 20;
        int ferrariSpeed = 200;
        int mustangSpeed = 170;
        int projectCarSpeed = 0;
        
        // Test methods
        //Porsche
        porscheSpeed = porsche911.brake(porscheSpeed);

        System.out.println("The Porsche braked and slowed down to: " + porscheSpeed + "mph");
        //Ferrari
        ferrariSpeed = ferrari812Superfast.accelerate(ferrariSpeed);

        System.out.println("The Ferrari accelerated to: " + ferrariSpeed + "mph");
        //Mustang
        fordMustangGT.changeTopSpeed(160);

        mustangSpeed = fordMustangGT.accelerate(mustangSpeed);

        fordMustangGT.engineSwap("V6");

        // Build project car
        projectCar.changeTopSpeed(155);
        projectCar.setAccelSpeed(50);
        projectCar.setBrakeSpeed(45);


        //Mustang
        mustangSpeed = fordMustangGT.accelerate();

        System.out.println("Mustang speed: " + mustangSpeed);
        //Ferrari
        ferrariSpeed = ferrari812Superfast.brake();

        System.out.println("Ferrari speed: " + ferrariSpeed);
        
        // Add spacinjg for table
        System.out.println("");
        System.out.println("");
        System.out.println("");

        // Print car details in table
        
        System.out.println("Brand\t\tModel\t\tEngine\t\tTop Speed");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(porsche911.getBrand() + "\t\t" + porsche911.getModel() + "\t" + porsche911.engineSpecs() + "\t\t" + porsche911.getTopSpeed());
        System.out.println(ferrari812Superfast.getBrand() + "\t\t" + ferrari812Superfast.getModel() + "\t" + ferrari812Superfast.engineSpecs() + "\t\t" + ferrari812Superfast.getTopSpeed());
        System.out.println(fordMustangGT.getBrand() + "\t\t" + fordMustangGT.getModel() + "\t" + fordMustangGT.engineSpecs() + "\t\t" + fordMustangGT.getTopSpeed());
        System.out.println(projectCar.getBrand() + "\t\t" + projectCar.getModel() + "\t\t" + projectCar.engineSpecs() + "\t\t" + projectCar.getTopSpeed());
        


    }
}
