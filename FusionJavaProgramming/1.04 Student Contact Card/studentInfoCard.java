/*
Name: John Doe
Date: August 18, 2025
Description: This program stores and displays a student's information card.
*/

public class studentInfoCard{
    public static void main(String[] args) {

        // Header
        System.out.println("********************************************************************************");
        System.out.println("*                                                                              *");
        System.out.println("*                                 Student Card                                 *");
        System.out.println("*                                                                              *");
        System.out.println("********************************************************************************");

        /*
        Name, birthday
        Nickname, Age, Grade
        */

        System.out.print("Name: John Doe |\t");
        System.out.print("Birthday: 01/01/2001 |\n");
        System.out.print("Nickname: John |\t");
        System.out.print("Age: 24 |\t");
        System.out.println("Grade: None |");
        
        // Seperator
        System.out.println();

        /*
        School, City
        */
        System.out.print("School: None |\t");
        System.out.println("City: Chicago, IL |");

        // Seperator
        System.out.println();

        /*
        Contact Information
        Phone number, Time available
        Email
        */
        System.out.print("Phone Number: 123-456-7890 |\t");
        System.out.print("Available: 10:00-5:00 |\n");
        System.out.println("Email: JohnDoe@gmail.com |");

        // Seperator
        System.out.println();

        /*
        Current math class
        Programming experience
        */
        System.out.print("Current Math Class: None |\n");
        System.out.println("Programming Experience: Medium level python class in 9th grade,");
        System.out.println("Starting Out With Python 3rd Edition, AP Comp Sci.");

        // Seperator
        System.out.println();

        /*
        Why am I taking APCS
        */
        System.out.println("I am taking AP Computer Science because computer sciences and coding");
        System.out.println("are very interesting to me, every program feels like a new problem");
        System.out.println("that I have to solve.");

    }
}
