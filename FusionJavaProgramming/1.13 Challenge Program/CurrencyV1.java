/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Charles Babbage (replace with your name)
 * @version 06/02/17       (replace with today's date)
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {

		// Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
		
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

		System.out.println("Starting US dollars: 		" + startingUsDollars);
		
        double pesosSpent = 7210.25;            								// Mexican Pesos spent
        double pesoExchangeRate = 18.78218;     								// 1 US dollar = 18.78218 Pesos
        double dollarsSpentInMexico = pesosSpent / pesoExchangeRate;      		// US dollars spent in Mexico
        double dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;   // US dollars remaining after Mexico

		System.out.println("Mexico:");
		System.out.println("	Pesos spent:		" + pesosSpent);
		System.out.println("	US dollars equivalent:	" + dollarsSpentInMexico);
		System.out.println("	US dollars remaining:	" + dollarsAfterMexico);
		
        //remaining variables below here
		// Conversion
        // code goes below here
		
		double eurosSpent = 550.25;												// Euros spent
		double euroExchangeRate = 0.857456;										// 1 US dollar = 0.857456 Euros
		double dollarsSpentInItaly = eurosSpent / euroExchangeRate;				// US dollars spent in Italy
		double dollarsAfterItaly = dollarsAfterMexico - dollarsSpentInItaly;	// US dollars remaining after Italy

		System.out.println("Italy:");
		System.out.println("	Euros spent:		" + eurosSpent);
		System.out.println("	US dollars equivalent:	" + dollarsSpentInItaly);
		System.out.println("	US dollars remaining:	" + dollarsAfterItaly);

		double cadSpent = 683.20;												// CAD spent
		double cadExchangeRate = 1.377230; 										// 1 US dollar = 1.377230 CAD
		double dollarsSpentInCanada = cadSpent / cadExchangeRate;				// US dollars spent in Canada
		double dollarsAfterCanada = dollarsAfterItaly - dollarsSpentInCanada;	// US dollars remaining after Canada

		System.out.println("Canada:");
		System.out.println("	Canadian dollars spent:	" + cadSpent);
		System.out.println("	US dollars equivalent:	" + dollarsSpentInCanada);
		System.out.println("	US dollars remaining:	" + dollarsAfterCanada);
		System.out.println("====================================================");
		System.out.println("Remaining US dollars:		"+ dollarsAfterCanada);




        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = budget1 / costItem1; 		//how many items can be purchased
		int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = (int)(budget2 / costItem2); 	//how many items can be purchased
		double fundsRemaining2 = budget2 % costItem2;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

