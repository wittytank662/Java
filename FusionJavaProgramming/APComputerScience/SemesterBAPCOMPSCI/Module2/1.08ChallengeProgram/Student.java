import java.util.Arrays;

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
        return String.format("%-1s %-14s %-18s", firstName, lastName, Arrays.toString(scores));
    }
}