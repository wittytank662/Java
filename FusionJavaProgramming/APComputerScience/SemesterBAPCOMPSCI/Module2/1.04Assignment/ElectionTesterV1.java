

public class ElectionTesterV1 {

    public static void printData(Candidate[] candidates) {
        for(Candidate item: candidates)
            System.out.println(item);
    }
    public static void main(String[] args) {
        
        Candidate[] candidates = new Candidate[5];
        // Add candidates
        candidates[0] = new Candidate("Tony Stark", 3691);
        candidates[1] = new Candidate("Henry Pym", 2691);
        candidates[2] = new Candidate("Bruce Banner", 1962);
        candidates[3] = new Candidate("Steve Rogers", 1491);
        candidates[4] = new Candidate("Carol Danvers", 1968);

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
        for(int index = 0; index < candidates.length; index++) {
            totVotes += candidates[index].getVotes();
        }
        for(int index = 0; index < candidates.length; index++) {
            int temp = candidates[index].getVotes();
            System.out.print(candidates[index].toString());
            System.out.printf("%-14.2f", (((double)temp/(double)totVotes) * 100));
            System.out.print("\n");

        }
    }
}
