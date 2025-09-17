import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){
        /*
            Scanner:
                *Declaring and Initializing Scanner class
                    **Use "new" keyword and access the constructor method

                *Must be imported:
                    import java.util.Scanner;

                *Close your scanner once you are done using it.

                Scanner Functions:

                    1.  .next()         | Returns a string - Delimiter: "Space" + "Carriage Return"(Enter)
                    2.  .nextLine()     | Returns a string - Delimiter: "Carriage Return"(Enter)
                    3.  .nextInt()      | Returns an int
                    4.  .nextDouble()   | Reutrns a double

        */

        // Example of Declaring and Initializing Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Welcome, " + name);

        System.out.println("What is the year you are born in? ");
        int year = input.nextInt();
        System.out.println("You are probably " + (2025 - year) + "s old");
        System.out.println("");
        

        input.close();
    }
}
