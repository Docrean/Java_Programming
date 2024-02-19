package m41_oop_part3_inheritance.super_keyword;

public class Student extends Person {

    public String schoolName; //make schoolName as instance since is different between students
    public String studentID;

    //creat constructor from parent class constructor
    //use super keyword to to do.
                                    //pass the schoolName and studentID into the constructor
                                    //use the .this keyword AFTER SUPER CONSTRUCTOR CALL
                                    //3 instances now set through the constructor call from Person.java
                                    //2 instances set through the this. (since studentID/schoolName called within Student subclass.)
    public Student(String name, int age, String gender, String schoolName, String studentID) { //constructor name always has to be the same as the class name
        super(name, age, gender); //will give compile error without super keyword to call the parent class constructor
        this.schoolName = schoolName; //3 parameters in the Person.java class constructor. need to pass them here
        this.studentID = studentID;//super keyword is calling the Person.java constructor which assigns the 3 given arguments to the instance variables
    }        //SO THE INSTANCE VARIABLES DON'T HAVE TO BE REPEATED IN THE CHILD CLASS.
            //Person.java constructor variables name, age, gender are constructor called in Student.java
            //Student.java constructor call sets the name, age, and gender of the student.
}

            //CONSTRUCTOR DETERMINES HOW ONE CAN CREATE THE OBJECT.

            //after adding the unique variables of this child class (studentID and schoolName in this case), can use
            ///intelliJ shortcut to GENERATE THE CONSTRUCTOR:
            //3 parent class constructor calls(name, age, gender) and 2 child class .this constructor calls(schoolName & studentID)