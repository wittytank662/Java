import java.util.Scanner;

public class BMI{
    public static void main(String [] args){
        // Name, date, and description
        // Author: Sam
        // Date: 10/7/2025
        // Description: This program calculates BMI from user input (height, weight)
        // and displays BMI and weight status.


        // Get input
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name (first last): ");
        String name = in.nextLine();

        System.out.print("Enter your weight in pounds: ");
        String weightInput = in.nextLine();
        double pounds = Double.parseDouble(weightInput);

        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        String heightInput = in.nextLine();
        String[] parts = heightInput.split(" ");
        int feet = Integer.parseInt(parts[0]);
        int inches = Integer.parseInt(parts[1]);

        // Conversion factors
        double INCHES_TO_METERS = 0.0254;
        double POUNDS_TO_KG = 0.453592;

        // Convert height to meters
        int totalInches = (feet*12) + inches;
        double heightMeters = totalInches * INCHES_TO_METERS;

        // Convert weight to kilos
        double weightKg = pounds * POUNDS_TO_KG;

        // Round height and meters to 1 decimal place
        heightMeters = Math.round(heightMeters * 10.0) / 10.0;
        weightKg = Math.round(weightKg * 10.0) / 10.0;

        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        // Round BMI to 1 decimal place
        bmi = Math.round(bmi * 10.0) / 10.0;

        // Determine weight status
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal or Healthy Weight";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }



        // Display output
        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");
        System.out.println("Name: " + name);
        System.out.println("Height (m): "+ heightMeters);
        System.out.println("Weight (kg): "+ weightKg);
        System.out.println("BMI: "+ bmi);
        System.out.println("Category: "+ status);

    }
}