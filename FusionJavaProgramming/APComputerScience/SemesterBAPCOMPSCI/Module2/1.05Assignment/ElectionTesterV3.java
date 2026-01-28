
public class ElectionTesterV3 {

    public static void printData(Candidate[] candidates) {
        for(Candidate item: candidates)
            System.out.println(item);
    }

    public static void changeName(Candidate[] candidates, String oldName, String newName) {
        for(int index = 0; index < candidates.length; index++) {
            if (candidates[index].getName().equals(oldName)) {
                candidates[index].setName(newName);
            }
        }
        System.out.println("<< Changing " + oldName + " to " + newName + " >>");
            
    }

    public static void changeVotes(Candidate[] candidates, String name, int newVotes) {
        for(int index = 0; index < candidates.length; index++) {
            if (candidates[index].getName().equals(name)) {
                candidates[index].setVotes(newVotes);
            }
        }
        System.out.println("<< Changing " + name + " votes to " + newVotes + " >>");
    }

    public static void replaceAll(Candidate[] candidates, String oldName, String newName, int newVotes) {
        for(int index = 0; index < candidates.length; index++) {
            if (candidates[index].getName().equals(oldName)) {
                candidates[index].setName(newName);
                candidates[index].setVotes(newVotes);
            }
        }
        System.out.println("<< Changing " + oldName + " to " + newName + " >>");
        System.out.println("<< Changing " + oldName + " votes to " + newVotes + " >>");
    }
    public static void main(String[] args) {
        
        Candidate[] candidates = new Candidate[5];
        // Add candidates
        candidates[0] = new Candidate("Tony Stark", 3691);
        candidates[1] = new Candidate("Henry Pym", 2691);
        candidates[2] = new Candidate("Bruce Banner", 1962);
        candidates[3] = new Candidate("Steve Rogers", 1491);
        candidates[4] = new Candidate("Carol Danvers", 1968);

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
            for(int index = 0; index < candidates.length; index++) {
                totVotes += candidates[index].getVotes();
            }
            for(int index = 0; index < candidates.length; index++) {
                int temp = candidates[index].getVotes();
                System.out.print(candidates[index].toString());
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
