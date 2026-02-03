import java.util.ArrayList;

public class StudentTester {
    public static void main(String[] args) {
        int[] scores1 = new int[5];
        int[] scores2 = new int[5];
        int[] scores3 = new int[5];
        int[] scores4 = new int[5];
        int[] scores5 = new int[5];

        scores1[0] = 94;
        scores1[1] = 80;
        scores1[2] = 100;
        scores1[3] = 98;
        scores1[4] = 86;

        scores2[0] = 63;
        scores2[1] = 81;
        scores2[2] = 48;
        scores2[3] = 59;
        scores2[4] = 28;

        scores3[0] = 100;
        scores3[1] = 98;
        scores3[2] = 100;
        scores3[3] = 99;
        scores3[4] = 90;

        scores4[0] = 74;
        scores4[1] = 50;
        scores4[2] = 83;
        scores4[3] = 78;
        scores4[4] = 66;

        scores5[0] = 84;
        scores5[1] = 90;
        scores5[2] = 99;
        scores5[3] = 89;
        scores5[4] = 86;

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("James", "Baker", scores1));
        students.add(new Student("John", "Doe", scores2));
        students.add(new Student("Joe", "Miller", scores3));
        students.add(new Student("Frank", "Burger", scores4));
        students.add(new Student("Blake", "Smith", scores5));

        System.out.println("Student name     Q1     Q2     Q3     Q4     Q5");
        System.out.println("-------------------------------------------------");

        System.out.println(students.get(4).toString());
    }
}
