package m38_oop_part1_constructor;

public class StudentClient {

    public static void main(String[] args) {

        Student student1 = new Student("Brandon",19); //new Student() is the default constructor as created by compiler
        student1.name = "Brandon"; //done manually without Constructor to set the instance variables in Student.java
        student1.age = 35; //done manually without Constructor to set the instance variables in Student.java
        System.out.println(student1.name); //prints null from student.java since no student name set in student.java
        System.out.println(student1.age);   //when ^student object created.
                                           //Since no parameterized constructor in Student.java, have to cll the instance
                                            //variables through the ^object student1.name = "Brandon";
    }
}                                           //name and age are no the arguments here for the constructor public Student(String name, int age)
                                            //in Student.java which are assigned to the instance variables of the Student.java Class "public class Student
