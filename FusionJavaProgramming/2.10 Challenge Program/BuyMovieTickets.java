import java.util.Scanner;

public class BuyMovieTickets {
    public static void main(String[] args) {
        System.out.println("Good Evening.");

        try (Scanner scanner1 = new Scanner(System.in)) {

            // Inputs

            System.out.print("Please enter your first and last name: ");
            String fullName = scanner1.nextLine();
            
            System.out.print("Enter today's date: ");
            String date = scanner1.nextLine();

            System.out.print("What movie would you like to see? ");
            String movie = scanner1.nextLine();

            System.out.print("How many tickets? ");
            String ticketAmt = scanner1.nextLine();

            System.out.print("What is the ticket price? ");
            String ticketPrice = scanner1.nextLine();

            System.out.print("Enter your debit card number (#####-###-####): ");
            String debitCard = scanner1.nextLine();

            System.out.print("Enter your PIN (####): ");
            String debitPin = scanner1.nextLine();

            // Receipt

            System.out.println();
            System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
            System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
            System.out.println("Your e-Receipt");
            System.out.println();

            // Format date as XX-XX-XX instead of XX/XX/XX
            String dateDashes = date.replace('/', '-');
            System.out.println(dateDashes);

            // Get indexes for start of last name and middle of debit card
            int spaceIndex = fullName.indexOf(" ");
            int midNum = debitCard.indexOf("-");

            // Combine order number
            String orderNum = (fullName.substring((spaceIndex + 2), (spaceIndex + 4)) + (debitCard.substring((midNum + 1), (midNum + 4))));

            System.out.println(orderNum);
            System.out.println();


            System.out.println(fullName.substring(0, 1) + ". " + (fullName.substring(spaceIndex + 1)));

        

            System.out.println("Name: " + fullName + "    Date: " + date + "    Movie: " + movie);
            System.out.println("Ticket Amount: " + ticketAmt + "    Ticket Price: " + ticketPrice);
            System.out.println("Debit Card: " + debitCard + "    Card PIN: " + debitPin);

        }




    }
}
