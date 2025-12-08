
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * This was not coded by me, this was a template given to me through the course i am following.
 * I edited it
 *  
 * @ author APCS Team
 * @ version 2020
 */
public class CalculationsV2
{
    public static void main(String[ ] args)
    {
        /*
            Primitive Data Types:

                *Primitive data types just store a variable. Objects/Classes can store more than one value and have extra functionality

                Data Types:

                    Whole Numbers:
                        1. byte  - 1 byte
                        2. short - 2 bytes
                        3. int   - 4 bytes
                        4. long  - 8 bytes

                    Decimal Numbers:
                        1. float  - 4 bytes
                        2. double - 8 bytes

                    Special:
                        1. boolean - (true and false)
                        2. char    - (Character)

                    **Strings are not primitives

                Declaring and Initializing Values:
                    Structure:
                        <data type> <name of variable> = <value>;

                    *Declaring a variable:
                        ex) int x;

                    *Initializing a variable:
                        ex) x = 5;

                    *Both at the same time:
                        ex) double y = 2.5;
         */

        System.out.println();
        System.out.println("Basic Equations");
        System.out.println("--------------------------------------");
        System.out.println();

        // Addition
        System.out.println("Addition");
        System.out.println( 25 + 9 );
        System.out.println( 43.21 + 3.14);
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println( 11 - 9 - 25 );
        System.out.println( 3.14 - 10.0 );
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( 25 * 9 ); 
        System.out.println(3.14 * 10.0 * 10.0 );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println( 9 / 25 );
        System.out.println( 43.21 / 10.0 );
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( 11 % 9 );
        System.out.println( 10.0 % 3.14 );
        System.out.println();
        
        // 1.08 Additional int Equations
        // --------------------------------------

        // Ints
        int num1 = 41;
        int num2 = 34;
        int num3 = 7;
        
        System.out.println();
        System.out.println("Additional int Equations");
        System.out.println("--------------------------------------");
        System.out.println();

        // Addition
        System.out.println("Addition");
        System.out.println( num1 + " + " + num2 + " = " + (num1 + num2) );
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println( num1 + " - " + num3 + " = " + (num1 - num2) );
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( (num1) + " * " + (num2) + " * " + (num3) + " = " + (num1 * num2 * num3) );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println( (num3) + " / " + (num2) + " = " + (num1 / num2) );
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( (num2) + " % " + (num1) + " = " + (num2 & num1) );
        System.out.println();
        
        // 1.09 Additional double Equations
        // --------------------------------------

        // Doubles
        double dNum1 = 5.3;
        double dNum2 = 7.14;
        double dNum3 = 17.82;

        System.out.println();
        System.out.println("Additional double Equations");
        System.out.println("--------------------------------------");
        System.out.println();

        // Addition
        System.out.println("Addition");
        System.out.println(dNum1 +  " + " + dNum3 + " = " + (dNum1 + dNum3) );
        System.out.println();

        //Multiplication
        System.out.println("Multiplication");
        System.out.println(dNum2 + " * " + dNum1 + " = " + (dNum2 + dNum1));
        System.out.println();
               
        // Modulus operator

        System.out.println("Modulus");
        System.out.println(dNum1 + " % " + dNum3 + " = " + (dNum1 % dNum3));
        System.out.println();


    } // end of main method
} // end of class
