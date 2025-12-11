import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class SecretPasscode {
    public static void main(String[] args) throws IOException {

        // Intro text
        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator.");
        System.out.println("The password will include lowercase, uppercase, & numbers.");

        // Initializing variables
        String password = "";
        String temp = "";
        String len = "temp";

        int passwordMinLen = 6;
        int passwordLen = 0;

        Random passwordChar = new Random();
        Random charLimit = new Random();

        // Initialize Scanner
        Scanner input = new Scanner(System.in);

        // Create/overwrite the file
        File file = new File("passwords.txt");
        PrintWriter outFile = new PrintWriter(file);

        boolean keepGoing = true;

        while (keepGoing) {

            // Get password length
            passwordLen = 0;
            while (passwordLen < passwordMinLen) {
                System.out.print("Enter a password length (6 or more): ");
                len = input.nextLine();
                try {
                    passwordLen = Integer.parseInt(len);
                } catch (NumberFormatException e) {
                    passwordLen = 0;
                }

                if (passwordLen < passwordMinLen) {
                    System.out.println("    Password length too short. Please try again.");
                }
            }

            // Create password
            password = "";
            for (int i = 0; i < passwordLen; i++) {
                int rangeChoice = charLimit.nextInt(2);
                int randNum;
                if (rangeChoice == 0) {
                    randNum = passwordChar.nextInt(90 - 48 + 1) + 48; // 48–90
                } else {
                    randNum = passwordChar.nextInt(122 - 97 + 1) + 97; // 97–122
                }
                char tempChar = (char) randNum;
                temp = Character.toString(tempChar);
                password = temp + password;
            }

            // Save password to file
            outFile.println(password);

            System.out.println("\nA password has been written to the text file");

            // Ask if user wants another password
            System.out.print("Would you like to generate another password? Y/N ");
            String choice = input.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                keepGoing = false;
            }
        }

        // Close the file after writing all passwords
        outFile.close();

        // End message
        System.out.println("\nThank you for using the Pass Code Generator.\n");
        System.out.println("Here are your randomly generated codes:");

        // Print passwords
        Scanner readFile = new Scanner(file);
        int count = 1;
        while (readFile.hasNextLine()) {
            String savedPassword = readFile.nextLine();
            System.out.println(count + ".\t" + savedPassword);
            count++;
        }
        readFile.close();

        input.close();
    }
}
