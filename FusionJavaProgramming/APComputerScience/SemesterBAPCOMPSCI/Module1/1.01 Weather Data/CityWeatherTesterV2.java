/**
 * Annual Weather client class
 * 
 * @author APCS Team
 * @version Today
 */
import java.util.Scanner;
public class CityWeatherTesterV2
{
    
   
    
    // method to print results (formatting output will be done in 6.02)

    public static void printWeatherData(String city, String state, String[] month, double[] temperature, double[] precipitation, String tempLabel, String precipLabel, double avgTemp, double totalPrecip) {
    
        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.printf("%-6s %15s %20s%n", "Month", "Temperature ("+ tempLabel + ")", "Precipitation (" + precipLabel + ")");
        System.out.println("");
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++) {
            // use printf to format
            System.out.printf("%-6s %15.1f %20.1f%n", month[index] + ".", temperature[index], precipitation[index]);
        }

        System.out.println("***************************************************");

        //System.out.println("    Average: " + "    Total: ");
        System.out.printf("     Average: %.1f      Total: %.1f%n", avgTemp, totalPrecip);
        
    }
   
    
    public static void main (String [] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "Daytona Beach";  //choose a city from the table provided
        String state = "FL";  //choose a city from the table provided
  
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};     //complete initialization of months array
        double [] temperature ={58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8};     //complete initialization of temperatures array
        double [] precipitation ={3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7};     //complete initialization of precipitation array
    
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
        
        //instantiate CityWeatherV2 object 
        
        CityWeatherV2 weather = new CityWeatherV2(month, temperature, precipitation);

        //input to decide F/C and in/cm - to be completed in 6.02
        
        System.out.print("Choose the temperature scale (F = Farenheit, C = Celsius): ");
        tempLabel = (in.next()).toUpperCase();

        System.out.print("Choose the precipitation scale (i = inches, c = centimeters): ");
        precipLabel = (in.next()).toUpperCase();
        System.out.println("");

        //conditions & method call to convert temp, if needed - to be completed in 6.02

        //conditions & method call to convert prec, if needed - to be completed in 6.02
        
        //method call to calculate the average temperature
        double avgTemp = weather.averageTemp();
        
        //method call to calculate the total precipitation
        double totalPrecip = weather.totalPrecipitation();
                     
        //method call to print results (hint: Need parameters for month, temperature, precipitation arrays, data labels and the average temperature, total precipitation variables)
    
        printWeatherData(city, state, month, temperature, precipitation, tempLabel, precipLabel, avgTemp, totalPrecip);
    
    


    }//end main
}//end class

