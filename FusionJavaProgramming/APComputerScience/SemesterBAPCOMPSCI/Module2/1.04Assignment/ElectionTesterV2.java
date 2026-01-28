
import java.util.ArrayList;

public class ElectionTesterV2 {

    public static void printData(ArrayList<Candidate> candidates) {
        for(Candidate item: candidates)
            System.out.println(item);
    }
    public static void main(String[] args) {
        
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        // Add candidates
        candidates.add(new Candidate("Tony Stark", 3691));
        candidates.add(new Candidate("Henry Pym", 2691));
        candidates.add(new Candidate("Bruce Banner", 1962));
        candidates.add(new Candidate("Steve Rogers", 1491));
        candidates.add(new Candidate("Carol Danvers", 1968));

        System.out.println(" Raw Election Data:");
        System.out.println();
        
        //Print raw election data
        printData(candidates);

        System.out.println();
        System.out.println();
        System.out.println("Election Results:");
        System.out.println();
        System.out.println("                  Votes         % of Total");
        System.out.println("Candidate        Recieved          Votes");
        System.out.println("==========================================");

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
    }
}
