/**
 * Annual Weather object class
 * 
 * @author APCS Team
 * @version Today
 */

public class CityWeatherV1 {
    // private instance variables - three arrays
    private String months[];
    private double temperatures[];
    private double precipitations[];

    // constructor with parameters
    public CityWeatherV1(String[] _months, double[] _temperatures, double[] _precipitations) {
        months = _months;
        temperatures = _temperatures;
        precipitations = _precipitations;
    }

    // setters and getters for each private instance variable

    // Getters
    public String[] getMonth() {
        return months;
    }

    public double[] getTemperatures() {
        return temperatures;
    }

    public double[] getPrecipitations() {
        return precipitations;
    }

    // Setters
    public void setMonths(String[] _months) {
        months = _months;
    }

    public void setTemperatures(double[] _temperatures) {
        temperatures = _temperatures;
    }
    
    public void setPrecipitations(double[] _precipitations) {
        precipitations = _precipitations;
    }

    // method to calculate the average of temperature

    public double averageTemp() {
        double temp = 0.0;

        for(int i = 0; i < temperatures.length; i++) {
            temp += temperatures[i];
        }
        return temp / temperatures.length;
    }
      
    // method to calculate total precipitation array
   
    public double totalPrecipitation() {
        double temp = 0.0;

        for(int i = 0; i < precipitations.length; i++) {
            temp += precipitations[i];
        }
        return temp;
    }
 
        
        

    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02


}
