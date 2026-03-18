public class Recursion {
    public static void main(String[] args) {
        /*
            Recursion:
                *Divide and conquer strategy
                *Recursive algorithms contains two things
                    1. Self call
                    2. Base case
            Warning:
                1. Make sure your base case is reached at some point
                2. Make sure there are not too many function calls (Stack Overflow)

        */
       int answer = piecewiseF(3);
       System.out.println("The answer is " + answer);
    }

    public static int piecewiseF(int x) {
        System.out.println("X is " + x);
        //base case
        if(x > 10)
            return 5;

        return piecewiseF(x + 2) - 2;
    }
}