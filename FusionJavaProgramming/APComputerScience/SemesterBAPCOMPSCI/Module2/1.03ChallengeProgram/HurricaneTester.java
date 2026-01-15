/**
 * Starter code for the Hurricane Tester
 * APCS Team 2020
 *
 */
 
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class HurricaneTester

{

    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();
        
		//create an array to store the categories for each hurricane		
        
        int [] category = new int[numValues];

		//convert the values in the windspeed array to MPH, use the converted windspeeds to fill the categories array

        for(index = 0; index < windSpeeds.length; index++) {
            windSpeeds[index] = (windSpeeds[index] * 1.15078);
        }

        for(index = 0; index < windSpeeds.length; index++) {
            if ((windSpeeds[index] >= 74) && (windSpeeds[index] <= 95)) {
                category[index] = 1;
            } else if ((windSpeeds[index] >= 96) && (windSpeeds[index] <= 110)) {
                category[index] = 2;
            } else if ((windSpeeds[index] >= 111) && (windSpeeds[index] <= 129)) {
                category[index] = 3;
            } else if ((windSpeeds[index] >= 130) && (windSpeeds[index] <= 156)) {
                category[index] = 4;
            } else if (windSpeeds[index] >= 157) {
                category[index] = 5;
            }
        }
		
		//user prompted for range of years
        
        Scanner in = new Scanner(System.in);

        int rangeMin = 0;
        int rangeMax = 2020;
        
        while ((rangeMin < 1995) || (rangeMin > 2019)) {
            System.out.print("Choose the minimum year you want for the range. (Min. 1995 / Max. 2019): ");
            rangeMin = in.nextInt();
            if ((rangeMin < 1995) || (rangeMin > 2019)) {
                System.out.print("Thats not a valid year.");
            }
            System.out.println("");
        }
        while ((rangeMax > 2019) || (rangeMax < 1995)) {
            System.out.print("Choose the maximum year you want for the range. (Min. 1995 / Max. 2019): ");
            rangeMax = in.nextInt();
            if ((rangeMax > 2019) || (rangeMax < 1995)) {
                System.out.print("Thats not a valid year.");
            }
            System.out.println("");
        }

		//create a Hurricane ArrayList of hurricane objects that are in the user's requested range
		
        ArrayList<Hurricane> hurricane = new ArrayList<Hurricane>();
            for (index = 0; index < numValues; index++) {
                hurricane.add(new Hurricane(years[index], names[index], months[index], category[index], pressures[index], windSpeeds[index]));
            }
        
		//print the hurricanes in the user's requested range
		
        //                         Hurricanes XXXX - XXXX
        //========================================================================

        System.out.println("                         Hurricanes " + rangeMin + " - " + rangeMax);
        System.out.println();
        System.out.println(" Year       Hurricane     Category    Pressure (mb)    Wind Speed (mph)");
        System.out.println("========================================================================");

        int rangeSize = 0;
        for(index = 0; index < hurricane.size(); index++) {
            int year = hurricane.get(index).getYear();
            if(year >= rangeMin && year <= rangeMax) {
                System.out.print(" ");
                System.out.println(hurricane.get(index).toString());
                rangeSize++;
            }
        }

        System.out.println("========================================================================");
        
		//calculate and display the summary data using the ArrayList

        //  Calculate average category
        int temp = 0;
        int count = 0;
        for (index = 0; index < category.length; index++) {
            int year = hurricane.get(index).getYear();
            if(year >= rangeMin && year <= rangeMax) {
                temp += hurricane.get(index).getCat();
                count++;
            }
        }
        double avgCat = (double)temp / count;

        //  Calculate averge pressure
        temp = 0;
        count = 0;
        for (index = 0; index < pressures.length; index++) {
            int year = hurricane.get(index).getYear();
            if(year >= rangeMin && year <= rangeMax) {
                temp += hurricane.get(index).getPressure();
                count++;
            }
        }
        double avgPressure = (double)temp / count;

        //  Calculate average wind speed
        temp = 0;
        count = 0;
        for (index = 0; index < windSpeeds.length; index++) {
            double year = hurricane.get(index).getYear();
            if(year >= rangeMin && year <= rangeMax) {
                temp += hurricane.get(index).getWindspeed();
                count++;
            }
        }
        double avgWindSpeed = (double)temp / count;

        // Create category array for categories in range
        int[] catRange = new int[rangeSize];
        count = 0;
        for (index = 0; index < category.length; index++) {
            int year = hurricane.get(index).getYear();
            if(year >= rangeMin && year <= rangeMax) {
                int cat = hurricane.get(index).getCat();
                catRange[count] = cat;
                count++;
            }
        }

        // Create category array for pressures in range
        int[] pressureRange = new int[rangeSize];
        count = 0;
        for (index = 0; index < pressures.length; index++) {
            int year = hurricane.get(index).getYear();
            if(year >= rangeMin && year <= rangeMax) {
                pressureRange[count] = hurricane.get(index).getPressure();
                count++;
            }
        }

        // Create category array for wind speeds in range
        double[] windRange = new double[rangeSize];
        count = 0;
        for (index = 0; index < windSpeeds.length; index++) {
            int year = hurricane.get(index).getYear();
            if(year >= rangeMin && year <= rangeMax) {
                windRange[count] = hurricane.get(index).getWindspeed();
                count++;
            }
        }

        double minD = Double.MAX_VALUE;

        // Calculate minimum category
        int minCat = Integer.MAX_VALUE;
        for (index = 0; index < catRange.length; index++) {
            if (catRange[index] < minCat) {
                minCat = catRange[index];
            }
        }
        // Calculate minimum pressure
        int minPressure = Integer.MAX_VALUE;
        for (index = 0; index < pressureRange.length; index++) {
            if (pressureRange[index] < minPressure) {
                minPressure = pressureRange[index];
            }
        }
        // Calculate minimum wind speed
        for (index = 0; index < windRange.length; index++) {
            if (windRange[index] < minD) {
                minD = windRange[index];
            }
        }

        double maxD = Double.MIN_VALUE;

        // Calculate maximum category
        int maxCat = Integer.MIN_VALUE;
        for (index = 0; index < catRange.length; index++) {
            if (catRange[index] > maxCat) {
                maxCat = catRange[index];
            }
            
        }
        // Calculate maximum pressure
        int maxPressure = Integer.MIN_VALUE;
        for (index = 0; index < pressureRange.length; index++) {
            if (pressureRange[index] > maxPressure) {
                maxPressure = pressureRange[index];
            }
            
        }
        // Calculate maximum wind speed
        for (index = 0; index < windRange.length; index++) {
            if (windRange[index] > maxD) {
                maxD = windRange[index];
            }
            
        }

        System.out.print("       Average:");
        System.out.printf("%13s %-12.1f %-15.1f %-11.1f", " ", avgCat, avgPressure, avgWindSpeed);

        System.out.print("\n       Minimum:");
        System.out.printf("%13s %-12d %-15d %-11.1f", " ", minCat, minPressure, minD);

        System.out.print("\n       Maximum:");
        System.out.printf("%13s %-12d %-15d %-11.1f", " ", maxCat, maxPressure, minD);

        // Print summary of categories

        System.out.println("\n");

        //Get total categories in cat 1-5

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        for (index = 0; index < category.length; index++) {
            int year = hurricane.get(index).getYear();
            if(year >= rangeMin && year <= rangeMax) {
                int cat = hurricane.get(index).getCat();
                if(cat == 1) {
                    count1++;
                } else if(cat == 2) {
                    count2++;
                } else if(cat == 3) {
                    count3++;
                } else if(cat == 4) {
                    count4++;
                } else if(cat == 5) {
                    count5++;
                }
            }
        }

        System.out.println("Summary of Categories:");
        System.out.println("   Cat 1: " + count1);
        System.out.println("   Cat 2: " + count2);
        System.out.println("   Cat 3: " + count3);
        System.out.println("   Cat 4: " + count4);
        System.out.println("   Cat 5: " + count5);

        in.close();
    }
}