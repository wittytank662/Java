public class WhileLoops{
    public static void main(String[] args){
        /*
            Loops:
                *Control flow statements that repeat sections of code when certain conditions are met

            while loops - Loops while a boolean expression is true.


            Structure:
                while(<boolean_expression>){
                    ```
                }

            

        Review:
            RNG:
                Math.random() - returns a double from 0(inclusive) to 1(exclusive)

                Formula for a random integer from [min, max] 
                    int num = (int)(Math.random()*(max - min + 1))
        */

        //Ex) Loops and modulus counters

        int x = 20;
        int counter = 0;

        while(x >= 0){

            if(x % 4 == 0){
                counter += 1;
                x -=4;
            } else{
                break;
            }
            System.out.println(counter);
            
        }
    }
}