public class FormattingStrings {
    public static void main(String[] args) {
        /*
            Formatting STrings:

                *You can create a formatted string
                    String.format() //Creates a formatted string

                *You can print out a formatted string
                    System.out.printf() //Print out formatted string

                Structure/Syntax:
                
                    String.format(String str, placeholders/arguments)

                    Placeholders:

                    %[arg$][flags][width][.precision]conversion //All lare optional except for the conversion

                    1. [arg$]
                        Numer followed by the $ which represents which argument is placed at that placeholder. Arguments start
                        at 1
                    2. [flags]
                        -       Make the output left-justified. ANy extra spaces will be placed on the right instead of left
                        #       Alternative output depending on conversion
                        +       Shows the positive symbol for positive numbers
                        "space" If the space character is used, there will be a prefix to the positive numbers so they align 
                        with negative numbers
                        0       pads numbers with zeros to the left
                        ,       Groups the numbers using commas
                    3. [width]
                        A whole number that represents the number of spaces the output takes up. If additional characters are 
                        needed the extra spaces will be aded to the left, unless you see the '-' flag
                    4. [.precision]
                        A decimal followed by a number that represents the number of decimal numbers you want the output to have
                    
                    5. conversion
                        a. s or S   - the conversion for a string. If capital S then the string will be capitalized
                        b. d        - a whole number
                        c. f        - a floating point number
        */

        //Examples
        String str = String.format("%s %s","Hello", "World");
        System.out.println(str);

        str = String.format("%1$s %s" ,"Hello", "World");
        System.out.println(str);

        str = String.format("%2$,3.2f %1$-10s squared", "meters", 1260.3256);
        System.out.println(str);
    }
}
