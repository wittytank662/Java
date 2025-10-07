public class ComparingStrings {
    public static void main(String[] args) {
        /*
            Comparing Strings:

                1. Equality:
                    *We don't use the == because it is unclear wheter or not the properties of that class are in fact equal.
                    * == checks if the variables are pointing to tehs ame object. Which is not always the case with strings and other classes.

                    We use is str1.equals(String str1)
                    OR
                    We use str2.equalsIgnoreCase(String str2)

                2. Alphabetical Comparison:
                    *Comparing two strings lexicographically 
                    *If a string that is being compared to another string comes before we get a negative value
                    *If a string that is being compared to another string comes after we get a positive value
                    *If a string that is being compared to another string is the same we get 0
                    *If a string that is being compared to another string is the same up to a length then it will return the number of missing letters

                    str1.compareTo(String str2)
                    str1.compareToIgnoreCase(String str2)


                    ** To Upper Case A String
                        .toUpperCase()

                    ** To Lower Case A String
                        .toLowerCase()


        */

        // Outputs 2 because App comes first, and app doesnt have 2 of the characters
        String str1 = "Apple";
        String str2 = "App";
        System.out.println(str1.compareTo(str2));
    }
}
