import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class SecretPasscode {
    public static void main(String[] args) throws IOException {
    
        // Initializing
        String password = "";
        String temp = "";
        String len = "temp";

        int passwordMinLen = 6;
        double passwordLen = 0;

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
        }

        // Create password
        for(int i = 0 ; i != passwordLen ; i++) {

            char tempChar = (char) passwordChar.nextInt(48, 123);

            temp = Character.toString(tempChar);
            password = temp + password;
        }
        outFile.println(password);
        outFile.close();
    }
}
