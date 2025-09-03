/**
 * This class demonstrates techniques for using mixed types in arithmetic expressions.
 * 
 * Parts of the code have been commented out by using a slash 
 * and an asterisk at the beginning of a code segment
 * and an asterisk and a slash at the end of a code segment.  
 * Remove those when you want to uncomment that segment of code
 * 
 * @Meg Abyte 
 * @version 06/02/17
 */
public class MixedTypes
{
    public static void main(String[ ] args)
    {
        /*
            Data Type Conversions:

                int <-> double conversions:
                    1. Assignment Conversion
                        a. Converting an int into a double through assignment is possible
                            ex) double x = 2;
                        b. Converting a double into an int is NOT possible. (lossy conversion error)
                            ex) int x = 2.5; //error

                    2. Arithmetic Promotion
                        a. We can promote(convert) an int into a double by doing arithmetic with a double
                            ex) System.out.println(10 * 3.14);

                    3. Casting
                        a. Casting an int to a double is an explicit form of conversion
                            ex) double x = 2 / 4; output: 0
                            ex) double x = (double)2 / 4; output: 0.5
                            ex) double x = (double)(2 / 4); output: 0
                            ex) double x = 2 / 4.0; output: 0.5
                        b. Casting a double into an int is an explicit form of conversion where information may be lost.
                            ex) int x = (int)(2.5/ 4.6); output: int, 0, data lost = .543
                            ex) int x = 2.5/ 4.6; output: error
                            ex) int x = (int)2.5/ 4.6; output: error
                    
                char <-> int conversion:
                    *You can convert using the three methods above but many times you will use the explicit casting for these conversions
                    ex) char c = (char) 125;

                    ex) int c = (int) 'C';   

         */

        // declare and assign local variables
        int iX = 23;                    //integer value
        int iY = -14;                   //integer value
        double dX = 33.987;             //double value
        double dY = -0.04387;           //double value
        
        int iSum;                       //integer sum 
        double dSum;                    //double sum
        
        // This is an example of Assignment Conversion
        double x = 100;     //100 is an int, but it is assigned to x which is a double
        System.out.println("This is an example of Assignment Conversion: double x = 100;");
        System.out.println("100 is an int, but it is assigned to x which is a double.");
        System.out.println("Consequently, the value of x is now: " + x);
        System.out.println();
        
        // This is an example of Arithmetic Promotion
        double y = 3.14 * 10 * 10;      //The 10s are ints, but 3.14 is a double
        System.out.println("This is an example of Arithmetic Promotion: double y = 3.14 * 10 * 10;");
        System.out.println("The 10s are ints, but 3.14 is a double");
        System.out.println("Consequently, the 10s are promoted to doubles to perform the arithmetic.");
        System.out.println("The value of y is: " + y);
        System.out.println();
        
        // This is an example of Casting demotion
        int z = (int)3.14 * 10 * 10;
        System.out.println("This is an example of Casting Demotion: int z = (int)3.14 * 10 * 10;");
        System.out.println("Placing (int) in front of 3.14 causes the decimal number to be treated as 3, an int.");
        System.out.println("The value of z is: " + z);
        System.out.println();
        // What happens if the casting is removed?
        
        // Addition with variables of same type: int
        // Remove the comments around this code when ready to run.   
        /*System.out.println("Addition of two ints");
        iSum = iX + iY;
        System.out.print(iX + " + " + iY + " = ");
        System.out.println(iSum);
        System.out.println();
        */
        
        // Addition with variables of same type: double
        // Remove the comments around this code when ready to run.   
        /*System.out.println("Addition of two doubles");
        dSum = dX + dY;
        System.out.print(dX + " + " + dY + " = ");
        System.out.println(dSum);
        System.out.println();
        */
        
        // arithmetic promotion of an int to a double
        // Remove the comments around this code when ready to run.   
        /*System.out.println("Arithmetically promoting an int to a double");
        System.out.println("in which an increase of precision occurs");
        dSum = iX + dY;
        System.out.print(iX + " + " + dY + " = ");
        System.out.println(dSum);
        System.out.println();
        */
       
        // Addition with variables of different type        
        // Remove the comments around this code when ready to run.   
        /*System.out.println("Addition of mixed variable types");
        iSum = dX + iY; //Why is iSum the wrong type to use in this statement?
        System.out.print(dX + " + " + iY + " = ");
        System.out.println(dSum);
        System.out.println();
        */   
        
        // casting double to an int, a narrowing conversion
        // Remove the comments around this code when ready to run.   
        /*System.out.println("Casting a double to an int (narrowing)");
        System.out.println("in which a loss of precision occurs.");
        iSum = iX * (int)dY;
        System.out.print(iX + " * " + (int)dY + " = ");
        System.out.println(iSum);
        System.out.println();
        */
        
        // casting an int to a double, a widening conversion
        // Remove the comments around this code when ready to run.   
        /*System.out.println("Casting an int to a double (widening)");
        System.out.println("in which an increase of precision occurs.");
        dSum = (double)iX / iY;
        System.out.print((double)iX + " / " + iY + " = ");
        System.out.println(dSum);
        System.out.println();
        */        
    }//end of main method
}//end of class

