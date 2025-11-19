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
                    <object variable>.<method or property>
        */

        //Using Static Methods
        double[] grades = {3.5, 4, 2.9, 4.2, 3.9};
        double gpa = Student.GpaCalculator(grades);
        System.out.println("GPA: " + gpa);


        // Create 3 instances of the Student class
        Student s1 = new Student("Sam", 12345, 10);
        Student s2 = new Student("Anne", 54234, 12);
        Student s3 = new Student("Bob", 97458, 9);

        System.out.println("The name of the first student s1 is " + s1.getName());
        System.out.println("The second student was in grade " + s2.getGrade());
        s2.graduateToNextGrade();
        System.out.println("Second student now graduated to grade " + s2.getGrade());
        System.out.println("Third students id is: " + s3.getId());


        /*
            Static vs Non-static methods/variables

            **The biggest difference is that static methods or variables can be accessed without an instance of a class/object
            **Static methods or variables are called "Class Method or Class Variable" vs non static "Instance Method or Instance Variable"

            Examples of Static Methods/Variables:
                * Math library 
                    Math.PI - static class variable that stores the constant Pi.

                    Math.sqrt() - static class method that calculates the square root of a number.

                *Integer class
                    Integer.parseInt() - static class method that turns a string into an integer if possible

            **Important: Notice that we use dot notation with the class name and not an instance variable for static methods/variables
        */
    }
}