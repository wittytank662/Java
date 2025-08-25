import java.util.Scanner; // Import Scanner

public class CalculationsV2Input {
    public static void main(String[] args) {
        // Choosing Numbers
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose a number (Int or float, negative works)");
            float num1 = Float.parseFloat(sc.nextLine());

            System.out.println("Choose a number (Int or float, negative works)");
            float num2 = Float.parseFloat(sc.nextLine());

            System.out.println("Choose a number (Int or float, negative works)");
            float num3 = Float.parseFloat(sc.nextLine());

            // Addition
            System.out.println("Addition");
            System.out.println("(" + num1 + ") + (" + num2 + ")");
            System.out.println( (num1) + (num2) );
            System.out.println("(" + num2 + ") + (" + num3 + ")");
            System.out.println( (num2) + (num3));
            //System.out.println();
        
            // Subtraction
            System.out.println("Subtraction");
            System.out.println("(" + num1 + ") - (" + num2 + ") - (" + num3 + ")");
            System.out.println( (num1) - (num2) - (num3) );
            System.out.println("(" + num2 + ") - (" + num3 + ")");
            System.out.println( (num2) - (num3) );
            //System.out.println();
            
            // Multiplication
            System.out.println("Multiplication");
            System.out.println("(" + num1 + ") * (" + num2 + ")");
            System.out.println( (num1) * (num2) ); 
            System.out.println("(" + num1 + ") * (" + num2 + ") * (" + num3 + ")");
            System.out.println((num1) * (num2) * (num3) );
            //System.out.println();
            
            // Division
            System.out.println("Division");
            System.out.println("(" + num1 + ") / (" + num2 + ")");
            System.out.println( (num1) / (num2) );
            System.out.println("(" + num2 + ") / (" + num3 + ")");
            System.out.println( num2 / num3 );
            //System.out.println();
            
            // Modulus operator
            System.out.println("Modulus");
            System.out.println("(" + num1 + ") % (" + num2 + ")");
            System.out.println( (num1) % (num2) );
            System.out.println("(" + num2 + ") % (" + num3 + ")");
            System.out.println( (num2) % (num3) );
            //System.out.println();
        }

        
    }
}