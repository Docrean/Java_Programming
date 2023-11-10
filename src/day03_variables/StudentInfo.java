package day03_variables;

public class StudentInfo {

    public static void main(String[] args) {
    //DataType variableName = Data;
        /*
         * first character: a-z, A-Z, _ or $ (no numbers)
         * after first character: a-z, A-Z, _ or $ (no numbers)
         * CANNOT INCLUDE SPACES
         * can not have special characters other than _ and $
         * cannot start with digits
         * Cannot be java reserved words
         */

        /*
        String studentName = "Brandon ",
                schoolName = "Cydeo",
                gradeLevel = "Mid level JD";

        int num1 = 100, num2 = 200, num3 = 300;
        */

        String student_name ="Brandon";
        String school_Name = "LACC";
        String grade_level = "Doctorate";
        String student_id = "C25";

        int age = 26;
        char gender = 'F';
        double gpa = 3.8;

        boolean isFullTime = true;
                            //false if student not full time

        System.out.println("school_Name = " + school_Name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("school_Name = " + school_Name);
        System.out.println("grade_level = " + grade_level);
        System.out.println("student_id = " + student_id);
        System.out.println("age = " + age);
        System.out.println("isFullTime = " + isFullTime);



    }

}


/*
1. Create a class named StudentInfo.java
2. Declare the following variables with appropriate data types:
        students_name
        age
        gender
        school_name
        student_id
        grade_level
        gpa
 */