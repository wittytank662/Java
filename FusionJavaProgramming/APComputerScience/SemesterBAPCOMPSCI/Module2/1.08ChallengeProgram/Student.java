
public class Student {
    
    private String firstName;
    private String lastName;
    private int[] scores = new int[5];

    public Student(String firstName, String lastName, int[] scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = scores;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getScore(int loc) {
        return scores[(loc - 1)];
    }

    public void setName(String _firstName, String _lastName) {
        firstName = _firstName;
        lastName = _lastName;
    }

    public void setScore(int loc, int score) {
        scores[(loc - 1)] = score;
    }

    public String toString() {
        return String.format("%-16s %-6d %-6d %-6d %-6d %-6d", firstName + " " + lastName, scores[0], scores[1], scores[2], scores[3], scores[4]);
    }
}