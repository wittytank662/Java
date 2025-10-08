import java.util.Scanner;

public class TDEE {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        // Get input
        System.out.print("Please enter your name: ");
        String name = in.nextLine();

        System.out.print("Please enter your BMR: ");
        String bmr = in.nextLine();

        System.out.print("Please enter your gender (M/F): ");
        String gender = (in.nextLine()).toUpperCase();

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

        if(gender.equals("M")){
            boolean isMale = true;
        }

        if(activityLevel == "A") {
            double activityFactor = 1.0;
        }



    }
}
