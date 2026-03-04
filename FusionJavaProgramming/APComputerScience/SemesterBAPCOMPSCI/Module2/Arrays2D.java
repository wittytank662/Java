public class Arrays2D {
    public static void main(String[] args) {
        /*
            2D Arrays:

                *Arrays with a set amount of rows and columns. Used to represent multiple pieces of info in one data structure
                *They can represent things like maps, grids, or organitional structures

            Syntax:
                1. <data type>[][] <name of array> = new <data type>[<rows>][<columns>];

                2. <data type>[][] <name of array> = {{...}, {...}, ...};
                
            Traversal:
                *Utilize two nested loops to traverse a 2D Array.
        */

        int[][] testScores = {
            {85, 91, 100, 78},
            {90, 94, 96, 92},
            {75, 45, 85, 78},
            {100, 98, 95, 99},
            {84, 92, 75, 85}
        };

        System.out.println("\t Quizzes:");
        for(int row = 0; row < testScores.length; row++) {
            System.out.print("Student " + (row + 1) + ": ");
            for(int col = 0; col < testScores[0].length; col++) {
                System.out.print(testScores[row][col] + " ");
            }
            System.out.println();
        }
    }
}
