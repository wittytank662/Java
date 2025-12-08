import java.util.Scanner;

public class TDEE {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        // Get input
        System.out.print("Please enter your name: ");
        String name = in.nextLine();

        System.out.print("Please enter your BMR: ");
        String bmr = in.nextLine();

        // parse bmr for double for BMR - Used https://www.geeksforgeeks.org/java/double-parsedouble-method-in-java-with-examples/# to review
        double BMR = Double.parseDouble(bmr);


        System.out.print("Please enter your gender (M/F): ");
        String gender = (in.nextLine()).toUpperCase();

        // Declare isMale
        boolean isMale = false;

        // Get isMale
        if(gender.equals("M")){
            isMale = true;
        }

        System.out.println();

        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athelete, Heavy Manual Labor)");

        System.out.println();

        System.out.print("Enter the letter corresponding to your activity level: ");
        String activityLevelIn = in.next();
        String activityLevel = activityLevelIn.toUpperCase();


        // Declare activityFactor
        double activityFactor = 0.0;

        // Assign activity factor based on activity level
        if((activityLevel.equals("A"))) {
            activityFactor = 1.0;
        } else if((activityLevel.equals("B"))) {
            activityFactor = 1.3;
        } else if((activityLevel.equals("C")) && (isMale == true)) {
            activityFactor = 1.6;
        } else if((activityLevel.equals("C")) && (isMale == false)) {
            activityFactor = 1.5;
        } else if((activityLevel.equals("D")) && (isMale == true)) {
            activityFactor = 1.7;
        } else if((activityLevel.equals("D")) && (isMale == false)) {
            activityFactor = 1.6;
        } else if((activityLevel.equals("E")) && (isMale == true)) {
            activityFactor = 2.1;
        } else if((activityLevel.equals("E")) && (isMale == false)) {
            activityFactor = 1.9;
        } else if((activityLevel.equals("F")) && (isMale == true)) {
            activityFactor = 2.4;
        } else if((activityLevel.equals("F")) && (isMale == false)) {
            activityFactor = 2.2;
        }

        // Calculate TDEE
        // TDEE = BMR * activityFactor
        double TDEE = (BMR * activityFactor);
        

        // Print output
        System.out.println();
        System.out.println();

        System.out.println("Your results:");
        System.out.println("Name: " + name + "                Gender: " + gender);
        System.out.println("BMR: " + BMR + " calories           Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");


    }
}
