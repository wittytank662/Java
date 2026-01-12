/**
 * @purpose
 *
 * @author Sam H.
 * @version 01/07/2026
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV2
{
    public static void main(String[] args)
    {
        //initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV2> cake = new ArrayList<CheeseCakeV2>();
            // add CheeseCake to the ArrayList
            cake.add(new CheeseCakeV2("Strawberry", 1));
            cake.add(new CheeseCakeV2("Chocolate", 2));
            cake.add(new CheeseCakeV2("Blueberry", 4));
            cake.add(new CheeseCakeV2("Blackberry", 3));
            cake.add(new CheeseCakeV2("Raspberry", 2));
            cake.add(new CheeseCakeV2("Plain", 5));
        
        //calls several method for each object to perform calculations
        for(CheeseCakeV2 dataRecord : cake)
        {
            // invoke methods
            dataRecord.calcTotalServings();
            dataRecord.calcCreamCheese();
            dataRecord.calcSugar();
            dataRecord.calcVanilla();
        }
        
        //printing the format of the table
        System.out.println(" |       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println(" | Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println(" |-------|----------|---------------|--------------|----------|-----------|-----------|");
        //System.out.printf("%4s %7s %11s %14s %14s %12s %10s", "1", "1", "1", "1", "1", "1", "1");

        CheeseCakeV2 dataRecord;
        
        //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++)
        {
            // print each CheeseCake's data
            System.out.printf("   %-8d", index + 1);
            System.out.println(cake.get(index).toString());
        }
    }
}
