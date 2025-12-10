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

                    1.[arg$]
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
        */

        //Examples
        String str = String.format("%s %s","Hello", "World");
        System.out.println(str);
    }
}
