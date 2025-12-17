public class Foreach {
    public static void main(String[] args) {
        /*
            For-each Loop:

                *Used in traversing data structures and accessing one value at a ime.
                *The benefits is that we do not need to set up a counter variable, is simpler/cleaner can't run into index out of bounds error.
                *The downsides are that you don't have access to the index, iterates in one direction, can not change the value stored in the array.
                *We create a temporary variable that will store each element of the array one at a time.
        */

        //Example of creating an array of objects
        Student[] classA = {
            new Student("Anne", 1324, 10),
            new Student("Bob", 4654, 10),
            new Student("Charles", 7513, 10),
            new Student("Danielle", 3584, 10)
        };

        //Example of for each loop
        for(Student s: classA){
            System.out.println(s.getName());
        }
    }
}
