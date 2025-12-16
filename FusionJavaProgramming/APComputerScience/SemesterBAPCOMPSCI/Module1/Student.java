public class Student {
    //Properties - variables that define class
    private String name;
    private int id;
    private int grade;
    private double gpa;

    //Constructor - creates the instnaces of this class
        // It is used to set default values
    public Student(String name, int _id, int _grade){
        //Example of keyword this.  - this.<variable> refers to the instance variable and NOT the local variable
        this.name = name;

        id = _id;
        grade = _grade;
        gpa = 0;
    }
    //Overloaded Methods - have the same name but there is a difference in parameteres
        //The parameters may be a different number of parameters, different data type, or a different order
        

    //Methods - Will give our class functionality and the ability to access/mutate properties

        //Static Method - GPA Calculator
    public static double GpaCalculator(double[] grades){
        double sum = 0;

        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        return sum/grades.length;
    }


        //Accessors/Mutators also known as (getters/setters)
        //Two types of methods: void vs return
            //Return type methods must include a return statement and must indicate what type of data will be returned
            //Void methods must include the void keyword in the signature

    //Getters
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getGrade(){
        return grade;
    }

    public double getGpa(){
        return gpa;
    }


    //Setter
    public void setName(String _name){
        name = _name;
    }

    public void setId(int _id){
        id = _id;
    }

    public void setGrade(int _grade){
        grade = _grade;
    }

    //Other methods that define functionality
    public void graduateToNextGrade(){
        if(grade<12)
            grade++;
        else{
            System.out.println("Congrats on graduating from High School");
            grade = 0;
        }
    }
}