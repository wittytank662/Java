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
        System.out.printf("%-6s %15s %20s%n", "Month", "Temperature (" + tempLabel + ")", "Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {
    // use printf to format
            System.out.printf("%-6s %15.1f %20.1f%n", month[index], temperature[index], precipitation[index]);
        }
        System.out.println("***************************************************");

        System.out.printf("Average: %.1f" + "    Total: %.1f%n", avgTemp, totalPrecip);

    }
    
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "";  //choose a city from the table provided
        String state = "";  //choose a city from the table provided
  
        String [] month = {"Jan", "Feb" };     //complete initialization of months array
        double [] temperature ={2.0, 4.5};     //complete initialization of temperatures array
        double [] precipitation ={53, 55};     //complete initialization of precipitation array
    
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
        


        //instantiate CityWeatherV2 object 
        
        CityWeatherTesterV2 cityWeather = new CityWeatherTesterV2();

        //input to decide F/C and in/cm - to be completed in 6.02
        
        System.out.println("Choose the temperature scale (F = Farenheight");

        //conditions & method call to convert temp, if needed - to be completed in 6.02
        
        //conditions & method call to convert prec, if needed - to be completed in 6.02
        
        //method call to calculate the average temperature
        
        //method call to calculate the total precipitation
                     
        //method call to print results (hint: Need parameters for month, temperature, precipitation arrays, data labels and the average temperature, total precipitation variables)
    
    
    
    


    }//end main
}//end class

