import java.util.ArrayList;

public class SortingAlgorithms {
    public static void main(String[] args) {
        /*
            Sorting Algorithms:

                1. Insertion Sort
                    *We will select a value starting onthe second index and iterate back to the begining.
                    *Each time we look back we will continue to either swap or stop(inserting the value in the correct spot)
                    *Each iteration will then move the key value to the next one and repeat

        */

        ArrayList<Student2> classroom = new ArrayList<Student2>();

        classroom.add(new Student2("Bob", 4));
        classroom.add(new Student2("Jackson", 9));
        classroom.add(new Student2("Anne", 7));
        classroom.add(new Student2("Sam", 2));
        classroom.add(new Student2("John", 5));
        classroom.add(new Student2("Sandra", 1));

        printArrayList(classroom);
        insertionSortByName(classroom);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        printArrayList(classroom);
        insertionSortByName(classroom);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void insertionSortByName(ArrayList<Student2> classroom) {
        int n = classroom.size();
        int j = 0;

        for(int i = 1; i < n; i++) {
            Student2 key = classroom.get(i);
            j = i-1;

            while(j >= 0 && classroom.get(j).getName().compareTo(key.getName()) < 0 ) { 
                classroom.set(j + 1, classroom.get(j));
                j--;
            }
            classroom.set(j + 1, key);
        }
    }

    public static void printArrayList(ArrayList<Student2> classroom){
        for(Student2 s: classroom){
            System.out.println("Student Name: " + s.getName()+ " Student ID: " + s.getId());
        }
    }
}
