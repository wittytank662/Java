import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class family {
    public static void main(String[] args) throws IOException {
        File file = new File("familyMembers.txt");

        Scanner inputFile = new Scanner(file);

        int totalFamilies = 0;
        int twoBoys = 0;
        int twoGirls = 0;
        int oneBoyOneGirl = 0;

        while (inputFile.hasNext()) {
            String family = inputFile.next().trim();
            totalFamilies++;

            if (family.equalsIgnoreCase("BB")) {
                twoBoys++;
            } else if (family.equalsIgnoreCase("GG")) {
                twoGirls++;
            } else if (family.equalsIgnoreCase("BG") || family.equalsIgnoreCase("GB")) {
                oneBoyOneGirl++;
            } else {
                System.out.println("Invalid data: " + family);
            }
        }

        inputFile.close();

        double percentTwoBoys = (twoBoys * 100.0) / totalFamilies;
        double percentTwoGirls = (twoGirls * 100.0) / totalFamilies;
        double percentOneBoyOneGirl = (oneBoyOneGirl * 100.0) / totalFamilies;

        System.out.println("Composition statistics for families with two children.");
          
        System.out.println();
        System.out.println("Total number of families: " + totalFamilies);

        System.out.println();
        System.out.println("Number of families with");
        System.out.println(".         2 boys: " + twoBoys + " represents " + String.format("%.2f", percentTwoBoys) + "%");
        System.out.println(".        2 girls: " + twoGirls + " represents " + String.format("%.2f", percentTwoGirls) + "%");
        System.out.println("1 boy and 1 girl: " + oneBoyOneGirl + " represents " + String.format("%.2f", percentOneBoyOneGirl) + "%");

    }
}
