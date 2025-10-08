import java.util.Scanner; //Imports Scanner

public class scannerTest {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

        System.out.print("Please enter your gender (M/F): ");
        String gender = (myObj.nextLine()).toUpperCase();

        System.out.println(gender);


        myObj.close();
        }
    }
}