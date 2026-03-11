import java.util.ArrayList;

public class StudentTester {

    public static void printStudents(ArrayList<Student> students) {
        System.out.println("Student name     Q1     Q2     Q3     Q4     Q5");
        System.out.println("-------------------------------------------------");
        for(Student student : students) {
            if(student != null) {
                System.out.println(student.toString());
            }
        }
        System.out.println();
    }

    public static void replaceName(ArrayList<Student> students, String oldName, String newFirstName, String newLastName) {
        for(int index = 0; index < students.size(); index++) {
            if(students.get(index) != null) {
                if(students.get(index).getName().equals(oldName)) {
                    students.get(index).setName(newFirstName, newLastName);
                    System.out.println("<< Changed " + oldName + " to " + newFirstName + " " + newLastName + " >>");
                    System.out.println();
                    return;
                }
            }
        }
    }

    public static void replaceQuizGrade(ArrayList<Student> students, String name, int quizNum, int newScore) {
        for(int index = 0; index < students.size(); index++) {
            if(students.get(index) != null) {
                if(students.get(index).getName().equals(name)) {
                    students.get(index).setScore(quizNum, newScore);
                    System.out.println("<< Changed " + name + "'s quiz " + quizNum + " to " + newScore + " >>");
                    System.out.println();
                    return;
                }
            }
        }
    }

    public static void replaceStudent(ArrayList<Student> students, String oldName, String newFirstName, String newLastName, int[] newScores) {
        for(int index = 0; index < students.size(); index++) {
            if(students.get(index) != null) {
                if(students.get(index).getName().equals(oldName)) {
                    students.set(index, new Student(newFirstName, newLastName, newScores));
                    System.out.println("<< Replaced " + oldName + " with " + newFirstName + " " + newLastName + " >>");
                    System.out.println();
                    return;
                }
            }
        }
    }

    public static void insertStudentBefore(ArrayList<Student> students, String findName, String newFirstName, String newLastName, int[] newScores) {
        for(int index = 0; index < students.size(); index++) {
            if(students.get(index) != null) {
                if(students.get(index).getName().equals(findName)) {
                    students.add(index, new Student(newFirstName, newLastName, newScores));
                    System.out.println("<< Added " + newFirstName + " " + newLastName + " before " + findName + " >>");
                    System.out.println();
                    return;
                }
            }
        }
    }

    public static void deleteStudent(ArrayList<Student> students, String name) {
        for(int index = 0; index < students.size(); index++) {
            if(students.get(index) != null) {
                if(students.get(index).getName().equals(name)) {
                    students.remove(index);
                    System.out.println("<< Deleted " + name + " >>");
                    System.out.println();
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] scores1 = {94, 80, 100, 98, 86};
        int[] scores2 = {63, 81, 48, 59, 28};
        int[] scores3 = {100, 98,100, 99, 90};
        int[] scores4 = {74, 50, 83, 78, 66};
        int[] scores5 = {84, 90, 99, 89, 86};

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("James", "Baker", scores1));
        students.add(new Student("John", "Doe", scores2));
        students.add(new Student("Joe", "Miller", scores3));
        students.add(new Student("Frank", "Burger", scores4));
        students.add(new Student("Blake", "Smith", scores5));

        System.out.println("Original Class:");
        printStudents(students);

        replaceName(students, "John Doe", "Johnny", "Doe");
        printStudents(students);

        replaceQuizGrade(students, "James Baker", 3, 95);
        printStudents(students);

        int[] newScores = {88, 92, 85, 90, 87};
        replaceStudent(students, "Frank Burger", "Franklin", "Burger", newScores);
        printStudents(students);

        int[] insertScores = {75, 80, 85, 90, 95};
        insertStudentBefore(students, "Joe Miller", "Jane", "Smith", insertScores);
        printStudents(students);

        deleteStudent(students, "Blake Smith");
        printStudents(students);
    }
}
