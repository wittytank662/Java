import java.util.Scanner;

public class CaesarTester {

    static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static int shiftKey = 0;
    public static void main(String[] args) {
        // Menu
        Scanner input = new Scanner(System.in);
        int choice = 0;

        System.out.println("================================");
        System.out.println("=   Please input a shift key   =");
        System.out.println("=            0 - 25            =");
        System.out.println("================================");
        while (!input.hasNextInt()) {
            System.out.print("Invalid input.");
            input.next();
        }
        shiftKey = input.nextInt();
        while (shiftKey < 0 || shiftKey > 25) {
            System.out.print("Invalid range.");
            while (!input.hasNextInt()) {
                System.out.print("Invalid input.");
                input.next();
            }
            shiftKey = input.nextInt();
        }
        input.nextLine();

        choice = 0;
        while (choice != 3) {
            System.out.println();
            System.out.println("==============================");
            System.out.println("=   Please input a command   =");
            System.out.println("=        1:Encryption        =");
            System.out.println("=        2:Decryption        =");
            System.out.println("=        3:Exit              =");
            System.out.println("==============================");

            while (!input.hasNextInt()) {
                System.out.print("Invalid input. Enter 1, 2, or 3: ");
                input.next();
            }
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.print("Enter a message to encrypt: ");
                String plaintext = input.nextLine();
                System.out.println();
                String encrypted = Encryption.encrypt(plaintext, shiftKey);
                System.out.println("Encrypted message: " + encrypted);
            }

            else if (choice == 2) {
                System.out.print("Enter a message to decrypt: ");
                String ciphertext = input.nextLine();
                System.out.println();
                String decrypted = Decryption.decrypt(ciphertext, shiftKey);
                System.out.println("Decrypted message: " + decrypted);
            }

            else if (choice != 3) {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("Program Ended.");
        input.close();
    }
}