public class MathTrick {
    public static void main(String[] args) {
        double num = Math.random();


        // Get original number

        int beginIndx = 2;
        int endIndx = 5;

        String numStr = String.valueOf(num);
        String startNum = numStr.substring(beginIndx, endIndx);
        //String startNum = "169"; -- Assignment instructions output APRILFOOL

        //System.out.println(startNum);
        if (startNum.startsWith("0")) {
            beginIndx += 1;
            endIndx += 1;
            startNum = numStr.substring(beginIndx, endIndx);
        }
        //System.out.println(numStr);
        
        System.out.println("1. The starting number: " + startNum);

        

        // Get reversed number
        String reversedNum = "";

        for (int i = 2; i != -1; i--) {
            String temp = startNum.substring(i, i + 1);
            reversedNum += temp;
            //System.out.println(startNum.substring(i));

        }
        System.out.println("2. The reversed number: " + reversedNum);

        // Get difference
        int startNumInt = Integer.parseInt(startNum);
        int reversedNumInt = Integer.parseInt(reversedNum);
        int differenceInt = 0;

        if(startNumInt >= reversedNumInt) {
            differenceInt = startNumInt - reversedNumInt;
            System.out.println("3. The difference is: " + differenceInt);
        } else if(startNumInt < reversedNumInt) {
            differenceInt = reversedNumInt - startNumInt;
            System.out.println("3. The difference is: " + differenceInt);
        }

        // Reverse Difference
        String difference = String.valueOf(differenceInt);
        String reversedDiff = "";

        for (int i = difference.length() - 1; i >= 0; i--) {
            String temp = difference.substring(i, i + 1);
            reversedDiff += temp;
        }

        // Add them together
        int reversedDiffInt = Integer.parseInt(reversedDiff);
        int sum = differenceInt + reversedDiffInt;

        System.out.println("4. The reversed number added to difference: " + sum);

        // Multiply by one million
        int timesOneMil = sum * 1000000;
        
        System.out.println("5. Number x one million: " + timesOneMil);

        // Subtract 733,361,573 and turn into string
        int minusALot = timesOneMil - 733361573;

        String stepF = String.valueOf(minusALot);

        System.out.println("6. Number subtracted and converted to String: " + stepF);

        // Replace with letters
        String replaced = "";

        for (int i = 0; i < stepF.length(); i++) {
            char ch = stepF.charAt(i);

            if (ch == '0') {
                replaced += "Y";
            } else if (ch == '1') {
                replaced += "M";
            } else if (ch == '2') {
                replaced += "P";
            } else if (ch == '3') {
                replaced += "L";
            } else if (ch == '4') {
                replaced += "R";
            } else if (ch == '5') {
                replaced += "O";
            } else if (ch == '6') {
                replaced += "F";
            } else if (ch == '7') {
                replaced += "A";
            } else if (ch == '8') {
                replaced += "I";
            } else if (ch == '9') {
                replaced += "B";
            }
        }

        System.out.println("7. Replaced string: " + replaced);

        // Reverse last time
        String finalMessage = "";

        for (int i = replaced.length() - 1; i >= 0; i--) {
            finalMessage += replaced.charAt(i);
        }

        System.out.println("8. Reversed string: " + finalMessage);
    


    }
}
