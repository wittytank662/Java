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

        // Initializing
        String password = "";
        String temp = "";
        String len = "temp";

        int passwordMinLen = 6;
        int passwordLen = 0;

        Random passwordChar = new Random();
        Random charLimit = new Random();

        // Initialize Scanner
        Scanner input = new Scanner(System.in);

        // Initialize PrintWriter
        PrintWriter outFile = new PrintWriter(new File("passwords.txt"));

        // Check if password is long enough
        while(passwordLen < passwordMinLen) {
            System.out.println("Enter a password length (6 or more)");
            len = input.nextLine();
            passwordLen = Integer.parseInt(len);

            if (passwordLen < passwordMinLen) {
                System.out.println("    Password length too short. Please try again.");
            }
        }

        // Create password
        for(int i = 0 ; i != passwordLen ; i++) {

            int rangeChoice = charLimit.nextInt(2);

            int randNum;
            if (rangeChoice == 0) {
                randNum = passwordChar.nextInt(90 - 46 + 1) + 48;
            } else {
                randNum = passwordChar.nextInt(122 - 97 + 1) + 97;
            }

            char tempChar = (char)randNum;

            temp = Character.toString(tempChar);
            password = temp + password;
        }
        outFile.println(password);
        outFile.close();

        System.out.println("Generated password: " + password);
        System.out.println("password saved to passwords.txt");

        input.close();
    }
}
