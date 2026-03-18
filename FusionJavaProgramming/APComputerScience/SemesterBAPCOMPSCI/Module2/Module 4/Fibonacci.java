public class Fibonacci {
    public static void main(String[] args) {
        int ans = fib(25);
        System.out.println("Fibonnaci number " + 8 + " is " + ans);
    }

    public static int fib(int n) {
        System.out.println("fib(" + n + ")");
        if(n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }
}
