
public class ElectionTesterV7 {

    public static void printData(Candidate[] candidates) {
        for(Candidate item: candidates)
            System.out.println(item);
    }

    public static void changeName(Candidate[] candidates, String oldName, String newName) {
        for(int index = 0; index < candidates.length; index++) {
            if(candidates[index] != null) {
                if (candidates[index].getName().equals(oldName)) {
                    candidates[index].setName(newName);
                }
            }
        }
        System.out.println("<< Changing " + oldName + " to " + newName + " >>");
            
    }

    public static void changeVotes(Candidate[] candidates, String name, int newVotes) {
        for(int index = 0; index < candidates.length; index++) {
            if(candidates[index] != null) {
                if (candidates[index].getName().equals(name)) {
                    candidates[index].setVotes(newVotes);
                }
            }
        }
        System.out.println("<< Changing " + name + " votes to " + newVotes + " >>");
    }

    public static void replaceAll(Candidate[] candidates, String oldName, String newName, int newVotes) {
        for(int index = 0; index < candidates.length; index++) {
            if(candidates[index] != null) {
                if (candidates[index].getName().equals(oldName)) {
                    candidates[index].setName(newName);
                    candidates[index].setVotes(newVotes);
                }
            }
        }
        System.out.println("<< Changing " + oldName + " to " + newName + " >>");
        System.out.println("<< Changing " + oldName + " votes to " + newVotes + " >>");
    }

    public static void addCandidate(Candidate[] candidates,int pos, String name, int votes) {
        for(int index = candidates.length - 1; index > pos; index--) {
            candidates[index] = candidates[index - 1];
        }

        candidates[pos] = new Candidate(name, votes);

        System.out.println("<< Added candidate " + name + " with " + votes + " votes to position " + pos + ". >>");
    }

    public static void addCandidateBefore(Candidate[] candidates, Candidate _candidate, String name, int votes) {
        int pos = -1;
        for(int index = 0; index < candidates.length; index++) {
            if(candidates[index] != null) {
                if(candidates[index].equals(_candidate)) {
                    pos = index;
                    break;
                }
            }
        }

        for(int index = candidates.length - 1; index > pos; index--) {
            candidates[index] = candidates[index - 1];
        }

        candidates[pos] = new Candidate(name, votes);

        System.out.println("<< Added candidate " + name + " with " + votes + " votes to position " + pos + ". >>");

    }

    public static void delCandidate(Candidate[] candidates, int pos) {
        candidates[pos - 1] = null;

        System.out.println("<< Deleted position " + pos + " >>");
    }

    public static void delCandidateName(Candidate[] candidates, String name) {
        int pos = -1;
        for(int index = 0; index < candidates.length; index++) {
            if(candidates[index] != null) {
                if(candidates[index].getName().equals(name)) {
                    pos = index;
                    break;
                }
            }
            
        }

        candidates[pos] = null;

        System.out.println("<< Deleted " + name + " >>");
    }
    public static void main(String[] args) {
        
        Candidate[] candidates = new Candidate[7];
        // Add candidates
        candidates[0] = new Candidate("Tony Stark", 751);
        candidates[1] = new Candidate("Henry Pym", 496);
        candidates[2] = new Candidate("Bruce Banner", 303);
        candidates[3] = new Candidate("Steve Rogers", 225);
        candidates[4] = new Candidate("Carol Danvers", 81);

        //System.out.println(" Raw Election Data:");
        //System.out.println();
        
        //Print raw election data
        //printData(candidates);

        System.out.println(" Original Results:");
        System.out.println();
        System.out.println("                  Votes         % of Total");
        System.out.println("Candidate        Recieved          Votes");
        System.out.println("==========================================");

        for(int index1 = 0; index1 < 8; index1++) {
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
                if(candidates[index] != null) {
                    totVotes += candidates[index].getVotes();
                }
                
            }
            for(int index = 0; index < candidates.length; index++) {
                if(candidates[index] != null) {
                    int temp = candidates[index].getVotes();
                    System.out.print(candidates[index].toString());
                    System.out.printf("%-14.2f", (((double)temp/(double)totVotes) * 100));
                    System.out.print("\n");
                }

            }
            System.out.println();
            System.out.println("The total number of votes is: " + totVotes);
            if (index1 == 0) {
                changeName(candidates, "Bruce Banner", "Stan Lee");
            } else if (index1 == 1) {
                changeVotes(candidates, "Henry Pym", 284);
            } else if (index1 == 2) {
                replaceAll(candidates, "Steve Rogers", "Captain America", 542);
            } else if (index1 == 3) {
                addCandidate(candidates, 3, "Peter Parker", 823);
            } else if (index1 == 4) {
                addCandidateBefore(candidates, candidates[3], "Black Widow", 291);
            } else if (index1 == 5) {
                delCandidate(candidates, 4);
            } else if (index1 == 6) {
                delCandidateName(candidates, "Henry Pym");
            }
        }
    }
}
