import java.util.Scanner;

public class MagpieRunner
{
  public static void main(String[] args)
  {

    // Instantiate a Magpie object
    Magpie chatbot = new Magpie();

    // Greet the user and get user input
    System.out.println(chatbot.getGreeting());
    Scanner input = new Scanner(System.in);
    String statement = input.nextLine();

    // Print the Magpie's responses
    while (!statement.equals("Bye"))
    {
      System.out.println(chatbot.getResponse(statement));
      statement = input.nextLine();
    }
    
  }
}