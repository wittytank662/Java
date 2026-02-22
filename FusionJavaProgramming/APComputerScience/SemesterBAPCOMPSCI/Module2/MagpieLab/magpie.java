public class magpie {
        public static int findKeyword(String statement, String goal, int startPos) {

            String phrase = statement.trim();
            int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
            int count = 0;
            while (psn >= 0) 
            {
                String before = " ", after = " ";
                if (psn > 0) 
                {
                before = phrase.substring (psn - 1, psn).toLowerCase();
                System.out.println("psn = "+ psn + " before = " + before + " after = " + after + " iteration = " + count);
                }
                if (psn + goal.length() < phrase.length()) 
                {
                after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
                System.out.println("psn = "+ psn + " before = " + before + " after = " + after + " iteration = " + count);
                }
                /* determine the values of psn, before, and after at this point in the method */
                if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))
                    &&
                    ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
                {
                return psn;
                }
                psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
                count++;
            }
            return -1;
        }

        public static void main(String[] args) {
            
            magpie magpie1 = new magpie();

            System.out.println(magpie.findKeyword("She's my sister", "sister", 0));
            System.out.println("--------------------------------------------------------");
            System.out.println(magpie.findKeyword("Brother Tom is helpful", "brother", 0));
            System.out.println("--------------------------------------------------------");
            System.out.println(magpie.findKeyword("I can't catch wild cats.", "cat", 0));
            System.out.println("--------------------------------------------------------");
            System.out.println(magpie.findKeyword("I know nothing about snow plows.", "no", 0));
            System.out.println("--------------------------------------------------------");



        }

}

