package m41_oop_part3_inheritance.super_keyword;

public class Student extends Person {

    public String schoolName; //make schoolName as instance since is different between students
    public String studentID;

    public Student(){ //no argument constructor using super keyword to call name, age, gender from parent class
        super("Unknown", 16, "Male");
    }
        //Two constructors with same Class name Student. 1st has no parameters. 2nd has parameters.

        //CONSTRUCTOR CALL HAS TO BE FIRST IN EVERY CONSTRUCTORS BODY.
        //THIS IS WHY super() CANNOT be used with this();

        //SUPER KEYWORD WITH PARENTHESES IS A MUST TO CALL EVERY SINGLE CHILD CLASS IN ORDER TO CALL THE PARENT CLASS
        //CONSTRUCTOR.

        //IF THE PARENT CLASS CONSTRUCTOR IS A NO ARG CONSTRUCTOR, THAN WILL HAVE TO MANUALLY GIVE THE SUPER KEYWORD AND
        //GIVE THE ARGUMENTS

    //create constructor from parent class constructor
    //use super keyword to do.
                                    //pass the schoolName and studentID into the constructor
                                    //use the .this keyword AFTER SUPER CONSTRUCTOR CALL
                                    //3 instances now set through the constructor call from Person.java
                                    //2 instances set through the this. (since studentID/schoolName called within Student subclass.)
    public Student(String name, int age, String gender, String schoolName, String studentID) { //constructor name always has to be the same as the class name
        super(name, age, gender); //will give compile error without the super keyword to call the parent class constructor
        this.schoolName = schoolName; //3 parameters in the Person.java class constructor. need to pass them here
        this.studentID = studentID;//super keyword is calling the Person.java constructor which assigns the 3 given arguments to the instance variables
    }        //SO THE INSTANCE VARIABLES DON'T HAVE TO BE REPEATED IN THE CHILD CLASS.
            //Person.java constructor variables name, age, and gender are constructor called in Student.java
            //Student.java constructor call sets the name, age, and gender of the student.
}

            //this.eat() or super.eat(): can use this. or super. to call the parent classes eat() method
            //System.out.println(super.age); can use super. to call the parent class variables
            //System.out.println(super.isHuman); can use super. to call static(since shared by all objects) variables of parent class

            //CONSTRUCTOR DETERMINES HOW ONE CAN CREATE THE OBJECT.

            //after adding the unique variables of this child class (studentID and schoolName in this case), can use
            ///intelliJ shortcut to GENERATE THE CONSTRUCTOR:
            //3 parent class constructor calls(name, age, gender) and 2 child class .this constructor calls(schoolName & studentID)