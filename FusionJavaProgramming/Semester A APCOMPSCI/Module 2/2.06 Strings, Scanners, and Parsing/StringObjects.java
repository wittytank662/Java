public class StringObjects {
    public static void main(String[] args){

        /*
            Strings contain useful methods

                1. length()                                                 - Returns the length of the string (doesnt start from 0)

                2a. indexOf(String str)                                     - Returns the index of the first occurance of the input string(parameter string), if something doesnt exist it returns -1
                    a. Returns 2
                    String a = "Banana";
                    int index = a.indexOf("na");
                    System.out.println(index);
                    
                    b. Returns -1
                    String a = "Banana";
                    int index = a.indexOf("orange");
                    System.out.println(index);

                2b. indexOf(String str, int fromIndex)                      - Returns the index of the first occurance of the input string(parameter string) starting from the fromIndex
                    a. Returns 4
                    String a = "Banana";
                    int index = a.indexOf("na", 3);
                    System.out.println(index);

                3. replace(CharSequence target, CharSequence replacement)   - replaces every instance of the target sequence with the replacement sequence
                    a. Returns Bamomo
                    String a = "Banana"
                    String b = a.replace("na", "mo");
                    System.out.println(b);
                4. replaceAll(String regex, String replacement)             - replaces all substring of the string that matches the regular expression with the replacement string

                5. substring(int beginIndex)                                - returns the substring of the orignal string starting at the given index all the way to the end

                6. substring(int beginIndex, int endIndex)                  - returns the substring of the orignal string starting at the given index up until the endIndex(exclusive)
                


        */

        // Returns 2
        String a = "Banana";
        int index = a.indexOf("na");
        System.out.println(index);

        // Returns -1
        int index2 = a.indexOf("orange");
        System.out.println(index2);

        // Returns 4
        int index3 = a.indexOf("na", 3);
        System.out.println(index3);

        // Returns "bamomo"
        String b = a.replace("na", "mo");
        System.out.println(b);

    }
}