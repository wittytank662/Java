public class ObjectTester {
    public static void main(String[] args) {
        /*
            Objects/Classes:
                *Objects and classes are the same thing
                *They represent a "custom" data type that can hold different properties and behavior

            Anatomy of an Object:
                *Properties: Class or instance variables that help define one object from another.

                *Constructor: Is a special method with the same name as the class that is used in creating an instance of the class.

                *Methods: Methods are useful to either access/mutate properties or represent certain behavior that the class should have.

            Creating an instance of an Object:
                *We use the 'new' keyword along with the constructor to create the instance of the object

                *Access properties/methods using dot notation
        */

        // Create 3 instances of the Student class
        Student s1 = new Student("Sam", 12345, 10);
        Student s2 = new Student("Anne", 54234, 12);
        Student s3 = new Student("Bob", 97458, 9);

        System.out.println("The name of the first student s1 is " + s1.getName());
        System.out.println("The second student was in grade " + s2.getGrade());
        s2.graduateToNextGrade();
        System.out.println("Second student now  " + s2.getGrade());
    }
}