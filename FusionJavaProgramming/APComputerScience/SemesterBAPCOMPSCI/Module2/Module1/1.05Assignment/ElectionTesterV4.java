
import java.util.ArrayList;

public class ElectionTesterV4 {

    public static void printData(ArrayList<Candidate> candidates) {
        for(Candidate item: candidates)
            System.out.println(item);
    }

    public static void changeName(ArrayList<Candidate> candidates, String oldName, String newName) {
        for(int index = 0; index < candidates.size(); index++) {
            if (candidates.get(index).getName().equals(oldName)) {
                candidates.get(index).setName(newName);
            }
        }
        System.out.println("<< Changing " + oldName + " to " + newName + " >>");
            
    }

    public static void changeVotes(ArrayList<Candidate> candidates, String name, int newVotes) {
        for(int index = 0; index < candidates.size(); index++) {
            if (candidates.get(index).getName().equals(name)) {
                candidates.get(index).setVotes(newVotes);
            }
        }
        System.out.println("<< Changing " + name + " votes to " + newVotes + " >>");
    }

    public static void replaceAll(ArrayList<Candidate> candidates, String oldName, String newName, int newVotes) {
        for(int index = 0; index < candidates.size(); index++) {
            if (candidates.get(index).getName().equals(oldName)) {
                candidates.get(index).setName(newName);
                candidates.get(index).setVotes(newVotes);
            }
        }
        System.out.println("<< Changing " + oldName + " to " + newName + " >>");
        System.out.println("<< Changing " + oldName + " votes to " + newVotes + " >>");
    }
    public static void main(String[] args) {
        
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        // Add candidates
        candidates.add(new Candidate("Tony Stark", 751));
        candidates.add(new Candidate("Henry Pym", 496));
        candidates.add(new Candidate("Bruce Banner", 303));
        candidates.add(new Candidate("Steve Rogers", 225));
        candidates.add(new Candidate("Carol Danvers", 81));

        //System.out.println(" Raw Election Data:");
        //System.out.println();
        
        //Print raw election data
        //printData(candidates);

        System.out.println(" Original Results:");
        System.out.println();
        System.out.println("                  Votes         % of Total");
        System.out.println("Candidate        Recieved          Votes");
        System.out.println("==========================================");

        for(int index1 = 0; index1 < 3; index1++) {
            if (index1 != 0) {
                System.out.println();
                System.out.println("                  Votes         % of Total");
                System.out.println("Candidate        Recieved          Votes");
                System.out.println("==========================================");
            }
            

            // Print data

            // Get total votes
            int totVotes = 0;
            for(int index = 0; index < candidates.size(); index++) {
                totVotes += candidates.get(index).getVotes();
            }
            for(int index = 0; index < candidates.size(); index++) {
                int temp = candidates.get(index).getVotes();
                System.out.print(candidates.get(index).toString());
                System.out.printf("%-14.2f", (((double)temp/(double)totVotes) * 100));
                System.out.print("\n");

            }
            System.out.println();
            System.out.println("The total number of votes is: " + totVotes);
            if (index1 == 0) {
                changeName(candidates, "Bruce Banner", "Stan Lee");
            } else if (index1 == 1) {
                changeVotes(candidates, "Henry Pym", 284);
            } else if (index1 == 2) {
                replaceAll(candidates, "Steve Rogers", "Captain America", 542);
            }
        }
        

        
    }
}
