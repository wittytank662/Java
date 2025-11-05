public class MathTrick {
    public static void main(String[] args) {
        double num = Math.random();


        // Get original number

        int beginIndx = 2;
        int endIndx = 5;

        String numStr = String.valueOf(num);
        String startNum = numStr.substring(beginIndx, endIndx);

        //System.out.println(startNum);
        if (startNum.startsWith("0")) {
            beginIndx += 1;
            endIndx += 1;
            startNum = numStr.substring(beginIndx, endIndx);
        }
        //System.out.println(numStr);
        
        System.out.println("The starting number: " + startNum);

        

        // Get reversed number
        String reversedNum = "";

        for (int i = 3; i != -1; i--) {
            String temp = "";
            System.out.println(startNum.substring(i));

        }
    }
}
