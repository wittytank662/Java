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
        
        while (rangeMin < 1995) {
            System.out.print("Choose the minimum year you want for the range. (Min. 1995): ");
            rangeMin = in.nextInt();
            if (rangeMin < 1995) {
                System.out.print("Thats not a valid year.");
            }
            System.out.println("");
        }
        while (rangeMax > 2019) {
            System.out.print("Choose the maximum year you want for the range. (Max. 2019): ");
            rangeMax = in.nextInt();
            if (rangeMax > 2019) {
                System.out.print("Thats not a valid year.");
            }
            System.out.println("");
        }

		//create a Hurricane ArrayList of hurricane objects that are in the user's requested range
		
        ArrayList<Hurricane> hurricane = new ArrayList<Hurricane>();
            for (index = 0; index <= numValues; index++) {
                hurricane.add(new Hurricane(years[index], names[index], months[index], category[index], pressures[index], windSpeeds[index]));
            }
        
		//print the hurricanes in the user's requested range
		
        
		//calculate and display the summary data using the ArrayList

        for(int index1 = 0; index1 < years.length; index1++) {
            System.out.println(years[index1] + " " + names[index1] + " " + category[index1] + " " + pressures[index1] + " " + windSpeeds[index1]);
        }
     }
}