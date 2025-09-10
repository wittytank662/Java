
public class PyTheorem {

    public static void main(String[] args) {
        
        // Get all the variables

        // Triangle 1
        int a = (int)(Math.random() * (23 - 5 + 1)) + 5;
        int b = (int)(Math.random() * (23 - 5 + 1)) + 5;
        double c = (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));

        // Triangle 2
        int d = (int)(Math.random() * (23 - 5 + 1)) + 5;
        int e = (int)(Math.random() * (23 - 5 + 1)) + 5;
        double f = (Math.sqrt(Math.pow(d, 2) + Math.pow(e, 2)));

        // Triangle 1
        System.out.print("Triangle 1   ");
        System.out.print("Side 1: "+ a + "    ");
        System.out.print("Side 2: "+ b + "    ");
        System.out.print("Hypotenuse: "+ c);
        System.out.println();

        // Triangle 2
        System.out.print("Triangle 2   ");
        System.out.print("Side 1: "+ d + "    ");
        System.out.print("Side 2: "+ e + "    ");
        System.out.print("Hypotenuse: "+ f);
        System.out.println();
    }
}
